package week1.day5;

public class LearnString {

	
	public String name() {
		String name="Elumalai N";
		return name;
	}
	
	public String mobileBrand(String brand)
	{
		return "Oppo";
	}
	
	public static void main(String[] args) {
		
		LearnString get=new LearnString();
		
		System.out.println(get.name());
		//Scanner value=new Scanner(System.in);
		//System.out.println("Enter your name:");
		//String brand=value.nextLine();
		
		//get.mobileBrand("brand");
}
}