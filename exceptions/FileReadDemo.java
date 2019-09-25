package com.pragim.model;
import java.io.FileReader;
class FileReadDemo
{
	public static void main(String args[]) 
	{
		
		try{
			
			//int x  =10/0;
			System.out.println("i am from try");
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		finally
		{
			
			System.out.println("i am from finally");
		}
		System.out.println("Done!");
		
	
	
	}



}