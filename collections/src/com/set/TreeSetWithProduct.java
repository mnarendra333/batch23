package com.set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetWithProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Product> ts = new TreeSet<Product>();
		
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <=3; i++) {
			System.out.println("enter product - "+i+" data");
			
			int pid = sc.nextInt();
			String pname = sc.next();
			double price = sc.nextDouble();
			
			Product obj = new Product(pid, pname, price);
			ts.add(obj);
		}
		System.out.println(ts);

	}

}
