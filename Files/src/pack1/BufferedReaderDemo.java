package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			
			br = new BufferedReader(new FileReader("abc.txt"));
			bw = new BufferedWriter(new FileWriter("xyz.txt"));
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
