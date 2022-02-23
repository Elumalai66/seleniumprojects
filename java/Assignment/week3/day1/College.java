package week3.day1;

public class College extends Department{
	
	
	public void collegName() {
		
		System.out.println("collegName : SRM College");
		
	}
	
	public void collegeCode() {
		
		System.out.println("collegeCode  : 12344");
		
	}
	
	public void collegRank() {
		
		System.out.println("collegRank  :  B");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College s = new College();
		s.studentDept();
		s.studentId();
		s.studentName();
		s.collegeCode();
		s.collegName();
		s.collegRank();
		s.deptName();
		

	}

}
