package com.set.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 10; i <=100; i+=10) {
			vector.add(i);
		}
		
		
		
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		System.out.println(vector);
//		for (Integer integer : vector) {
//			System.out.println(integer);
//		}
//		
//		System.out.println("===============================");
//		Enumeration<Integer> elements = vector.elements();
//		while (elements.hasMoreElements()) {
//			System.out.println(elements.nextElement());
//		}
//		
//		//enumaration works for only legacy classes
//		ArrayList<Integer> al = new ArrayList<Integer>();
	
		//
		//f6 - next line
		//f5 - go inside a method
		//f8 - next debug point
		
		

	}

}
