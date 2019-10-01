package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//converting al into ll
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			al.add(i);
		}
	//	System.out.println(al);
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>(al);
		
		System.out.println(ll);
		
		ll.addFirst(5);
		System.out.println(ll);
		
		ll.addLast(999);
		System.out.println(ll);
		
		ll.add(7, 65);
		
		System.out.println(ll);
		
		ll.set(1, 11);
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		//ll.clear();
		
		//System.out.println(ll);
		
		ll.remove();
		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		ll.remove(new Integer(999));
		System.out.println(ll);
		ll.add(60);
		System.out.println(ll);
		
		
		
		System.out.println(ll.get(5));
		
		
		
	
		
		
		

	}

}
