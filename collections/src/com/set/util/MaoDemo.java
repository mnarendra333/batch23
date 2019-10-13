package com.set.util;

import java.util.HashMap;
import java.util.Map;

public class MaoDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new 
						
		HashMap<Integer, String>();
		hm.put(101, "john");
		hm.put(102, "miller");
		hm.put(103, "doug");
		hm.put(104, "beeman");
		hm.put(105, "nikhil");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
//		hm.clear();
//		System.out.println(hm.isEmpty());
//		System.out.println(hm);
		hm.put(106, "nikhil");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}
}
