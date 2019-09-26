package pack1;

import java.util.Date;

public class Student {
	
	private int sid;
	private String sName;
	private int marks;
	
	public Student(int sid, String sName, int marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}
	
	
	public String toString() {
		
		return "[" +sid+" "+sName+" "+marks +" ]";
	}
	
	public static void main(String[] args) {
		
		
		Student obj = new Student(101, "raja", 500);
		System.out.println(obj.sid+" "+obj.sName+" "+obj.marks);
		
		String stu = obj.toString();
		System.out.println(obj);
		
		Date date = new Date();
		String toDaysDate = date.toString();
		
		
		
		
		
		
	}
	
	

}
