package com.bnpparibas.cib.discount.criteria;

public class DiscountCriteria implements IDiscountCriteria {

	private Integer qty;

	private double amount;

	public DiscountCriteria(Integer quantity, double amnt) {
		this.qty = quantity;
		this.amount = amnt;
	}

	@Override
	public Integer getQty() {
		return qty;
	}

	@Override
	public double getAmount() {
		return amount;
	}

}
