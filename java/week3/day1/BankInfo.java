package week3.day1;

public class BankInfo extends AxisBank {
	  
	//method
	
	public void saving() {
		
		System.out.println("savings");
	}
	
    public void fixed() {
		
		System.out.println("fixed");
	}
    public void deposit() {
	
	    System.out.println("deposit7");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object
		
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();

	}

}
