package com.set.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// insert somedata into list
		ArrayList<String> al = new ArrayList<String>();
		al.add("muhesh");
		al.add("ravi");
		al.add("anil");
		al.add("vamsi");
		System.out.println(al);
		
		ListIterator<String> listIterator = al.listIterator();
		System.out.println("==========forward direction==========");
		while (listIterator.hasNext()) {
			String str = listIterator.next();
			if(str.equals("anil"))
				listIterator.set("anilkumar");
			
			if(str.equals("vamsi"))
				listIterator.add("kamal");
		}
		System.out.println("==========backword direction==========");
		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str);
		}
		System.out.println(al);
	}
}
