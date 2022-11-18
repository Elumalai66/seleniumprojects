package InterviewPgm;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	String str = "madam",rev = "";
  
		for (int i = str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
		}	
			if (str.equals(rev)) {
				
				System.out.println("palindrome");
			}
			
				else{
					
					System.out.println("not a palindrome");
				
				
			
			
		}  
		
		
		
		
	}

}
