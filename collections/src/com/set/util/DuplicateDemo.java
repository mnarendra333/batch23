package com.set.util;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Kamini Roy was a leading Bengali poet social worker and feminist in British India She was the first woman honours graduate in British India";
		String[] split = str.split(" ");
		Set<String> set = new HashSet<String>();
		for (String string : split) {
			
			if(!set.add(string))
				System.out.println(string);
		}
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
