package week3.day1;

public class Student1 {
	
	public void getStudentsInfo(int id ) {
		
		System.out.println("id          :"+" "+ id);
	}
	
    public void getStudentsInfo(int id,String name ) {
		
		System.out.println("id and name :" + " "+ id +" " +name);
	}
	
	
    public void getStudentsInfo(String email ) {
		
		System.out.println("email       :"+ " " + email );
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s = new Student1();
		s.getStudentsInfo(1233);
        s.getStudentsInfo("bobby@gmail.com");
        s.getStudentsInfo(1235,"bobby");
	}
}
