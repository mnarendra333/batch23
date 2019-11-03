package com.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(30);
		al.add(10.5f);
		al.add(20.5);
		al.add(true);
		al.add(10.5);
		al.add(40);
		al.add(30);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(1000));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.remove(new Integer(30)));
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.lastIndexOf(30));
		
		System.out.println("=========================");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)+" ");
		}
		System.out.println("=========================");
		
		al.set(5, 90);
		System.out.println(al);
		
		ArrayList al2 = (ArrayList)al.clone();
		System.out.println(al2);
		
		
		

	}

}
