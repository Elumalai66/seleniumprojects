package week3.day2;

public class Bank extends SBI implements CIBIL,PNB {

	public void cibilScore() {
		
		System.out.println("cibilScore : 5000");
		
	}

	public void maximumLoanAmount() {
		
		System.out.println("maximumLoanAmount : 5lakh");
		
	}

	public void creditScore() {
		
		System.out.println("creditScore : 12");
	}

	public void minimumBalance() {
		
		System.out.println("minimumBalance : 5K");
	}

	@Override
	public void bankBalance() {
	
		System.out.println("bankBalance : 1lakh");
		
	}
	
	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		b.cibilScore();
		b.maximumLoanAmount();
		b.creditScore();
		b.minimumBalance();
		b.bankBalance();
		
	}

}