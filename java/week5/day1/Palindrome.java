package week5.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "madam",rev ="";
		
		for (int i =a.length()-1; i >=0; i--) {
			
			rev = rev +a.charAt(i);
			
		}
			if (a.equals(rev)) {
				
				System.out.println("its palindrome");
				
				
			}
			
			else {
				
				System.out.println("not a palindrom");
			}
			
			
		}
		

	}


