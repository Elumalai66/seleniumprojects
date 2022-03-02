package week4.day2;

public class LearnStatic {
	
     static String employeeName;
     int empId;
	 static String companyName;
	 boolean isActive;
	
	
	LearnStatic(){
		
		System.out.println("Default Constructor");
	}
	
	LearnStatic(String EmployeeName,String companyName ,int empId){
		this();
		this.employeeName=EmployeeName;
		this.companyName=companyName;
		this.empId=empId;
		System.out.println("Parametrized Constructor");
	}
	
	public static void main(String[] args) {
		LearnStatic learn =new LearnStatic("Anil","testleaf",101);
		
		LearnStatic learn2 =new LearnStatic("Anitha","TCS",102);
		System.out.println(learn.employeeName);
		System.out.println(learn.empId);
		System.out.println(learn.companyName);
	
		System.out.println(learn2.employeeName);
		System.out.println(learn2.empId);
		System.out.println(learn2.companyName);
	}

}
