package week2.day1;

public class FindOccurance {


		public void occurence() {
			
			String str = "welcome to chennai";
			int count=0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='e')
					
				{
					count++;
				}
				
			}
			
			System.out.println(count);
		}
		
		public void anotherMethod() {
			String input="welcome to chennai";
			String replace = input.replace("e", "");
			
			System.out.println(input.length()-replace.length());
		}


		public static void main(String[] args) {
			
			
			FindOccurance s = new FindOccurance();
			s.anotherMethod();
			s.anotherMethod();
			
		}

}

	
	



