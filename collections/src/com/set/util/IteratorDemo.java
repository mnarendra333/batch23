package com.set.util;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		//insert somedata into list
		for (int i = 10; i <=100; i+=10) {
			al.add(i);
		}
		System.out.println(al);
		
		System.out.println("====================");
		Iterator<Integer> iterator = al.iterator();
		//read && remove 
		while (iterator.hasNext()) {
			Integer i1 = iterator.next();
			if(i1 == 80)
				iterator.remove();
		}
		System.out.println(al);
		
		
		

	}

}
