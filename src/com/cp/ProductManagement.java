package com.cp;

import java.util.Scanner;

public class ProductManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductCRUD p = new ProductCRUD();
		while(true) {
		System.out.println("1.add product\n2.product details\n3.remove product\n4.search product\n5.sortedProduct\n6.exit");
		System.out.println("enter yout choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			p.addProduct();
			break;
		case 2:
			p.ProdutDetails();
			break;
		case 3:
			p.removeProduct();
			break;
		case 4:
			p.searchProduct();
			break;
		case 5:
			p.sortProduct();
			
			break;
		case 6:System.exit(0);
		default:
			System.out.println("invalid choice");
		}
		}
	}

}
