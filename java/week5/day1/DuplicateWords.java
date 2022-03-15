package week5.day1;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "we learn java basics as part of java sessions in java week1 ";
		String[] str = a.split("  ");
		
		for (int i = 0; i<str.length; i++) {
			
			System.out.println(str[i]);
			
			for (int j = 1+i; j<str.length; j++) {
				
		
		           if (str[i].equals(str[j])){
		        	   
  	   
		        	str[j]=" ";   
		        	   
		        	
		        	 System.out.println(str[j]); 
		        	
		
		
		           }	
		
			}
			
			  
			
		
		} 
		
	}

}
