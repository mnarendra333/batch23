package com.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 100; i <=1000; i+=100) {
			al.add(i);
		}
		System.out.println(al);
		
		//length = length();
		Vector<Integer> vobj = new Vector<Integer>();
		vobj.addAll(al);
		System.out.println(vobj);
		
		
		for(int i=0;i<vobj.size();i+=1)
			System.out.println(vobj.get(i));
		
		System.out.println("=================");
		for (Integer integer : vobj) {
			System.out.println(integer);
		}

	}

}
