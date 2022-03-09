package com.cp.prasad;

import java.util.Comparator;

public class NameComparator implements Comparator<Product2> {

	public int compare(Product2 product1, Product2 product2) {
		if((product1.getProductName().compareTo(product2.getProductName())) == 0)
		return 0;
		else if((product1.getProductName().compareTo(product2.getProductName())) > 1)
			return 1;
		else
			return -1;
	}
}
