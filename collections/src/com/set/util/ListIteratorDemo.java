package com.set.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// insert somedata into list
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 10; i <= 100; i += 10) {
			al.add(i);
		}
		System.out.println(al);
		
		
		
		ListIterator<Integer> listIterator = al.listIterator();
		System.out.println("==========forward direction==========");
		while (listIterator.hasNext()) {
			
			Integer integer = listIterator.next();
			if(integer>=40 && integer<=80)
			System.out.println(integer);
		}
		
		System.out.println("==========backword direction==========");
		while (listIterator.hasPrevious()) {
			Integer integer = listIterator.previous();
			System.out.println(integer);
		}
	}

}
