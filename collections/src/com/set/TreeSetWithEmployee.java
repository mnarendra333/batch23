package com.set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetWithEmployee {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <3; i++) {
			System.out.println("Enter emp data "+i);
			int id = sc.nextInt();
			String name = sc.next();
			double sal = sc.nextDouble();
			
			Employee e = new Employee(id, name, sal);
			ts.add(e);
		}
		
	
		
		System.out.println(ts);
		

	}

}
