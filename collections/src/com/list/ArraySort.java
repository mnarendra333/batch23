package com.list;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15,19,33,14,65,27};
		
		sortTheArray(a);
	}

	private static void sortTheArray(int data[]) {
		// TODO Auto-generated method stub
		
		 int n = data.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (data[j] > data[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = data[j];
	                    data[j] = data[j+1];
	                    data[j+1] = temp;
	                }
	        
	        
	        
	      for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}

}
