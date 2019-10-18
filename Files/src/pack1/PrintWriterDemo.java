package pack1;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			PrintWriter pw = new PrintWriter("testfile.txt");
			pw.print(100);
			pw.print("hello");
			pw.print('a');
			pw.print(true);
			
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
