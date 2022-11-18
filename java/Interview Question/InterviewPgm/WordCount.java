package InterviewPgm;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Enter the Name :");
		
		String c = d.nextLine(); // enter the input
		int count = 0;		

		System.out.println("User length :" + c);

		
		//for (int i = 0; i < c.length(); i++) {
	    String[] f = c.split(" ");
	    
	    for (int j = 0; j < f.length; j++) {

	    	count ++;		
	    }

	    
    	System.out.println(count);

		
        
	}
}

