package week1.day5;

import java.util.Scanner;

public class Palindrome {
	
        public void findPalindrome() {
		
		String a, b;
		StringBuffer sb;
		Scanner get=new Scanner(System.in);
		
		System.out.println("Enter the String to check :");
		
		a=get.nextLine();
		
		sb=new StringBuffer(a);
		
		b=sb.reverse().toString();
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("The given text is palindrome");
		}
		else
		{
			System.out.println("The given text is not a palindrome");
		}
		
		
	}
	
	public static void main(String[] args) {
	     
		  Palindrome obj=new Palindrome();
	
	      obj.findPalindrome();
		
}
}


