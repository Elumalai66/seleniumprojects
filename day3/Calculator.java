package week1.day3;

public class Calculator {
	
	
	public int d;
	
	public void addTwoNumber() {
		int a=10;	
		int b=20;
		  int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber() {
		int a=10;
		int b=20;
		int d=a-b;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc=new Calculator();
		calc.addTwoNumber();
		calc.subTwoNumber();
		
	}

}
