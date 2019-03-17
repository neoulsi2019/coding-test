package com.bnpparibas.cib.basket;

import com.bnpparibas.cib.market.MarketStore;

public class BasketMain {

	public static void main(String[] args) {
		Basket b = new Basket();
		Item item = new Item(MarketStore.APPLE, 4);
		b.getItems().add(item);

		item = new Item(MarketStore.ORANGE, 3);
		b.getItems().add(item);

		item = new Item(MarketStore.WATERMELON, 5);
		b.getItems().add(item);

		System.out.println("Total price is " + b.getTotalPrice());

		System.out.println("Total discount is " + b.getTotalDiscount());

		System.out.println("Total price after discount is " + b.getTotalPriceAfterDiscount());
	}

}
