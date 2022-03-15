package week5.day3;

import java.util.Iterator;

public class StringStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "TestLeaf Located in Thenapettai" ;
		String [] Split1 = str.split(" ");
		 
		for (int i = 0; i < Split1.length; i++) {
			
			if(Split1[i].startsWith("T")) {
			
			System.out.println(Split1[i]);
		}
		
		
		}
	}
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String str = "Test Leaf Located in Thenapettai";
		String[] split1 = str.split(" ");
		
		for (int i = 0; i < split1.length; i++) {
			
			if (split1[i].startsWith("T")) {
				
				System.out.println(split1[i]);	
				
			}
			
		}      */
		
	
		
		
		

	


