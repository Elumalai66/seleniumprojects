package InterviewPgm;



import java.util.Arrays;
import java.util.Iterator;

public class DecendingOrder {


		// Main driver method
		public static void main(String[] args)
		{
			// Initialize array
			// The array contains 6 elements.
			int[] array = new int[] { -5, -9, 8, 12, 1, 3 };

			// Displaying elements of original array
			
			//System.out.print("Elements of original array: ");
			
			for (int i =(array.length); i >0; i--) {
				
			//	System.out.print(array[i] + " ");
				
			
			}	

			// Using Arrays.sort() method to sort array
			// elements in ascending order.
			
			Arrays.sort(array);

			//System.out.println();

			// Displaying elements of array after sorting
			System.out.println(
				"Elements of array sorted in ascending order : "
					+ Arrays.toString(array));
		}
	}

