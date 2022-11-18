package InterviewPgm;
public class patternpgm {

	public static void main(String[] args) {
		
		//for row
		for (int i = 0; i < 8; i++) {
			
			for (int j = 8; j >i; j--) {
				
				System.out.print(" ");
			}
			//for column
			for(int k=0;k<=i;k++) {	
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}

