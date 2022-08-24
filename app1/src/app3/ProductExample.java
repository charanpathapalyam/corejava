package app3;

import java.util.Scanner;

public class ProductExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("enter product name ");
	String productNmae  = sc.nextLine();
	
	System.out.println("enter the product price");
	double price  = sc.nextDouble();
	
	System.out.println("Enter the quantity");
	int qty = sc.nextInt();
	
	double totalprice  = price*qty;
	
	System.out.println(totalprice);
	
}
}
