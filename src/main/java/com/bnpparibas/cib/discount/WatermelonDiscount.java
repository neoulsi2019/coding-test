package com.bnpparibas.cib.discount;

import com.bnpparibas.cib.discount.criteria.IDiscountCriteria;

public class WatermelonDiscount implements IDiscount {

	public static final WatermelonDiscount INSTANCE = new WatermelonDiscount();

	private WatermelonDiscount() {
	}

	@Override
	public double getDiscount(IDiscountCriteria criteria) {
		if (criteria.getQty() < 3) {
			return 0d;
		}
		return criteria.getAmount() * 2 / 3;
	}

}
