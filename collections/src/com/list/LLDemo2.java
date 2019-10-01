package com.list;

import java.util.LinkedList;

public class LLDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("ravi");
		ll.add("arun");
		
		ll.add("nikhil");
		ll.add("sunil");

		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
			
		}
		System.out.println("=====================");
		
		for (String string : ll) {
			System.out.println(string);
		}
		
	
	}

}
