package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) {
		
		
		try {
			BufferedWriter obj = new BufferedWriter(new FileWriter("abc.txt"));
			obj.write("hello");
			obj.write(100);
			obj.newLine();
			for (int i = 65; i <=90; i++) {
				obj.write(i);
			}
			obj.flush();
			System.out.println("Done!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
