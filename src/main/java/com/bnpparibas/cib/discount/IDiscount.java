package com.bnpparibas.cib.discount;

import com.bnpparibas.cib.discount.criteria.IDiscountCriteria;

public interface IDiscount {

	double getDiscount(IDiscountCriteria criteria);
}