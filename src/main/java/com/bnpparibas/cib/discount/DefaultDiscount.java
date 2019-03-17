package com.bnpparibas.cib.discount;

import com.bnpparibas.cib.discount.criteria.IDiscountCriteria;

public class DefaultDiscount implements IDiscount {

	public static final DefaultDiscount INSTANCE = new DefaultDiscount();

	private DefaultDiscount() {
	}

	@Override
	public double getDiscount(IDiscountCriteria criteria) {
		return 0d;
	}
}
