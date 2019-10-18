package pack1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileReader fr = new FileReader("C:\\Users\\sapuser\\Desktop\\movDataa.txt");
			int k;
			while ((k=fr.read())!=-1) {
				System.out.print((char)k);
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
