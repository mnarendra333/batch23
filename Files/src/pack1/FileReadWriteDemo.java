package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			
			fis = new FileInputStream("C:\\Users\\sapuser\\Desktop\\34.jfif");
			fos = new FileOutputStream("d:\\targetimage.jfif");
			
			
			int ch;
			while ((ch = fis.read())!=-1) {
				fos.write((char)ch);
				System.out.print((char)ch);
			}
			System.out.println("file copied");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
