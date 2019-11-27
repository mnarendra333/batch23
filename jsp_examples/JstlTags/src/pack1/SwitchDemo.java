package pack1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chrecter");
		String str = sc.next();
		char ch = str.charAt(0);

		switch (ch) {
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;

		case 'i':
			System.out.println(ch + " is a vowel");
			break;

		case 'o':
			System.out.println(ch + " is a vowel");
			break;

		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");

		}

	}

}
