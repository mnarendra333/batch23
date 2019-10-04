package com.list;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for reverse");
		
		String name = sc.next();
		
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			stack.push(chars[i]);
		}
		System.out.println();
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		
		for (int i = 0; i < stack.size(); ) {
			System.out.print(stack.pop());
		}

	}

	

}
