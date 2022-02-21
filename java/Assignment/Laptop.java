package Assignment;

public class Laptop extends pc {
	
         //Over Ridee	
	
        public void getSystemInfo() {
		
		System.out.println("Window 10");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l = new Laptop();
		l.getSystemInfo();

	}

}
