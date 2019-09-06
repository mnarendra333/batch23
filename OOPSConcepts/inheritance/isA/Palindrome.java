import java.util.Scanner;
class Palindrome
{

		
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String word = sc.next();
		System.out.println("entered  word is "+word);
		String finalWord = "";
		
		
		for(int i=word.length()-1;i>=0;i--)
			finalWord = finalWord+word.charAt(i);
		
		System.out.println("finalWord is "+finalWord);
		
		if(word.equals(finalWord))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}
		

}