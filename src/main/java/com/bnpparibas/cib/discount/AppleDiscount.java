package com.bnpparibas.cib.discount;

import com.bnpparibas.cib.discount.criteria.IDiscountCriteria;

public class AppleDiscount implements IDiscount {

	public static final AppleDiscount INSTANCE = new AppleDiscount();

	private AppleDiscount() {
	}

	@Override
	public double getDiscount(IDiscountCriteria criteria) {
		if (criteria.getQty() < 2) {
			return 0d;
		}
		return criteria.getAmount() * 0.5;
	}

}