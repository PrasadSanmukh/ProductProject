package com.cp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 

 

public class ProductCRUD {
List<Product> list=new ArrayList<Product>();
Scanner sc=new Scanner(System.in);
Product product;

public void addProduct() {
	System.out.println("enter the product id");
	String productId=sc.next();
	System.out.println("enter the product name");
	String productName=sc.next();
	System.out.println("enter the produt price");
	double productPrice=sc.nextDouble();
	 product=new Product(productId, productName, productPrice);
	 list.add(product);
}
public void ProdutDetails()
{
	for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
	}
}
public void removeProduct()
{
	System.out.println("enter the product id");
	String id=sc.next();
	Iterator i=list.iterator();
	
	while(i.hasNext())
	{
		Product p1=(Product)i.next();
		if(p1.getProductId().equals(id))
		{
			i.remove();
		}
		}
	
}
public  void searchProduct()
{
	System.out.println("enter the Product id");
	String id=sc.next();
	Iterator i=list.iterator();
	int falg=0;
	while(i.hasNext())
	{
		Product p1=(Product)i.next();
		if(p1.getProductId().equals(id))
		{
			System.out.println(p1);
			falg++;
		}
	}
	if(falg>0)
	{
		System.out.println("id found");
		falg=0;
	}
	else
	{
		System.out.println("id not found");
	}
}
public void sortProduct() {
	Collections.sort(list);

	for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
	}
}
}
