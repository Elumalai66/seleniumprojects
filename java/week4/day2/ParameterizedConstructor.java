package week4.day2;

public class ParameterizedConstructor {
	
	
	  static String employename;
	  int employeid;
	  String companyname;
	  boolean isactive;
	  
	    
	  ParameterizedConstructor(String Employename, int Employeid,String Companyname){
		  
		  employename = Employename; 
		  employeid  = Employeid;
		  companyname  = Companyname;
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor s = new ParameterizedConstructor("bobby", 12345,"capgemini");
		
		
		ParameterizedConstructor s1 = new ParameterizedConstructor("dobby", 3335,"zoho");
		
		System.out.println(s.employename);
		System.out.println(s.employeid);
		System.out.println(s.companyname);
		
		System.out.println(s1.employename);
		System.out.println(s1.employeid);
		System.out.println(s1.companyname);
		

	}

}
