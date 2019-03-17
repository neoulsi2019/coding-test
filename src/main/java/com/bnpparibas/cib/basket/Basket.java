package com.bnpparibas.cib.basket;

import java.util.HashSet;
import java.util.Set;

import com.bnpparibas.cib.discount.DiscountFactory;
import com.bnpparibas.cib.discount.IDiscount;
import com.bnpparibas.cib.discount.criteria.DiscountCriteria;

public class Basket {

	private Set<Item> items = new HashSet<Item>();

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		return this.items.stream().map(item -> item.getItemPrice()).reduce(0d, (a, b) -> a + b);
	}

	public double getTotalDiscount() {
		return this.items.stream()
				.map(item -> this.getItemDiscount(item)
						.getDiscount(new DiscountCriteria(item.getQty(), item.getItemPrice())))
				.reduce(0d, (a, b) -> a + b);
	}

	public Double getTotalPriceAfterDiscount() {
		return this.getTotalPrice() - this.getTotalDiscount();
	}

	private IDiscount getItemDiscount(Item item) {
		return DiscountFactory.getDiscountObject(item.getProduct().getType());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basket other = (Basket) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}

}
