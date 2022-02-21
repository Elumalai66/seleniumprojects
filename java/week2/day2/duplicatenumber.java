package week2.day2;

public class duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,14,23,44,55,66,77,88,99,99,88};
		

		for (int i = 0; i < arr.length; i++) {
			
			int count =1;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
				count++;
			}
				}
			
			if(count>1) {
					
					System.out.println(arr[i]);
					
				}
			
		}

	}

	}
