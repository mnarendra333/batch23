package pack1;

import java.util.StringTokenizer;

public class SplitDemo {
	
	public static void main(String[] args) {
		
		
		
		String str = "Today is not a holiday";
		
		String[] split = str.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		System.out.println("==================================");
		
		StringTokenizer stokenizer = new StringTokenizer(str," ");
		while (stokenizer.hasMoreTokens()) {
			System.out.println(stokenizer.nextToken());
		}
		
	}

}
