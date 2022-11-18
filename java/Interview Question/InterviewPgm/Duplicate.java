package InterviewPgm;

import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "All are same same for all";
		String b = text.toUpperCase();
		String[] a = b.split(" ");
		
        for (int i = 0; i < a.length; i++) {
        	
        	 int count = 1;    //instalize
        	
        	for (int j = i+1; j <a.length; j++) 
        		
        		
        		if(a[i].equals(a[j]))
        		{
        			
        			count++;
        		
        	}
        			
        		if(count>1) {
        				
        				System.out.println(a[i]);
        			}
        		}
				
			}
			
		}



