package com.bnpparibas.cib.discount;

import com.bnpparibas.cib.product.ProductType;

public class DiscountFactory {

	public static IDiscount getDiscountObject(ProductType productType) {
		switch (productType) {
		case APPLE:
			return AppleDiscount.INSTANCE;
		case WATERMELON:
			return WatermelonDiscount.INSTANCE;
		default:
			return DefaultDiscount.INSTANCE;
		}

	}
}
