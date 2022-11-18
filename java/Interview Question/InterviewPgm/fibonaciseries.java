package InterviewPgm;

public class fibonaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		System.out.println(first);
		int second = 1;
		System.out.println(second);
		int sum=0;
		
		for (int i = 2; i <=10; i++) {
			
			sum = first + second ;
			
		System.out.println(sum);
			
			first=second;
			second= sum;
			
		}   

	}    
}


