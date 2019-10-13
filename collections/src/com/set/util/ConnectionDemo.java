package com.set.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(50);
		al.add(10);
		al.add(30);
		al.add(19);
		al.add(100);
		
		Collections.sort(al,new MyComparator());
		for (Integer integer : al) {
			System.out.println(integer);
		}

	}

}
class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}
