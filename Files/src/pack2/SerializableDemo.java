package pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws Exception {
		
		//convert student object into file format/byteStrteam
		
		Student stu = new Student();
		stu.setStuId(101);
		stu.setStuName("Surya");
		stu.setMarks(200);
		
		
		//serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
		oos.writeObject(stu);
		
		
		//deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
		Student stuObj = (Student)ois.readObject();
		System.out.println(stuObj);

	}

}
