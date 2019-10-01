package com.list;

import java.util.LinkedList;
import java.util.Scanner;

public class LLDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <=4; i++) {
			System.out.println("Enter "+i);
			ll.add(sc.next());
		}
		
		System.out.println(ll);

	}

}
