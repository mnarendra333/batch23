package com.set.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer numbers[] = {10,4,70,34,56,23};
		System.out.println("before sort");
		for (int i : numbers) {
			System.out.println(i);
		}
		Arrays.sort(numbers);
		System.out.println("after sort");
		for (int i : numbers) {
			System.out.println(i);
		}
		
		
		String names[] = {"balu","anil","arun","kamal","hari"};
		TreeSet<String> ts= new TreeSet<String>();
		for (String string : names) {
			ts.add(string);
		}
		
		System.out.println(ts);
		
		
		
		List<Integer> asList = Arrays.asList(numbers);
		System.out.println(asList);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Integer integer : numbers) {
			al.add(integer);
		}
		System.out.println(al);
		
		
		
		
	}

}
