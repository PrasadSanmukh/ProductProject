package com.cp.prasad;

import java.util.Comparator;

public class PriceComparatorDesc implements Comparator<Product2>{

	@Override
	public int compare(Product2 product1, Product2 product2) {
		if(product1.getProductPrice() == product2.getProductPrice())
		return 0;
		else if(product1.getProductPrice() > product2.getProductPrice())
			return -1;
		else
			return 1;
	}

	 
}
