package com.bnpparibas.cib.basket;

import org.junit.Assert;
import org.junit.Test;

import com.bnpparibas.cib.market.MarketStore;

public class BasketTest {

	@Test
	public void testAppleDiscount() {
		Basket b = new Basket();
		Item appleItem = new Item(MarketStore.APPLE, 4);
		b.getItems().add(appleItem);
		Assert.assertEquals("Wrong total Amnt ", 0.8d, b.getTotalPrice(), 0d);
		Assert.assertEquals("Wrong total discount ", 0.4d, b.getTotalDiscount(), 0d);
		Assert.assertEquals("Wrong total after discount ", 0.4d, b.getTotalPriceAfterDiscount(), 0d);
	}

	@Test
	public void testOrangeDiscount() {
		Basket b = new Basket();
		Item appleItem = new Item(MarketStore.ORANGE, 3);
		b.getItems().add(appleItem);
		Assert.assertEquals("Wrong total Amnt ", 1.5d, b.getTotalPrice(), 0d);
		Assert.assertEquals("Wrong total discount ", 0d, b.getTotalDiscount(), 0d);
		Assert.assertEquals("Wrong total after discount ", 1.5d, b.getTotalPriceAfterDiscount(), 0d);
	}

	@Test
	public void testWatermelonDiscount() {
		Basket b = new Basket();
		Item appleItem = new Item(MarketStore.WATERMELON, 5);
		b.getItems().add(appleItem);
		Assert.assertEquals("Wrong total Amnt ", 4d, b.getTotalPrice(), 0d);
		Assert.assertEquals("Wrong total discount ", 2.67d, b.getTotalDiscount(), 0.01d);
		Assert.assertEquals("Wrong total after discount ", 1.33d, b.getTotalPriceAfterDiscount(), 0.01d);
	}

}
