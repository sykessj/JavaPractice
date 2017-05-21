package general7_commonElements;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Create the 2 arrays
		int[] Array1 = { 1, 2, 5, 7, 9, 11, 12, 14, 16 };
		int[] Array2 = { 3, 4, 5, 6, 8, 10, 11, 14 };

		// Create an arraylist to hold the common elements
		List<Integer> commons = new ArrayList<>();

		// Find which array is bigger in size
		if (Array1.length >= Array2.length) {
			//If array 1 is bigger, it puts array 1 as the first variable
			commons = commonElements(Array1, Array2);
		} else {
			//if array2 is bigger, it puts array 2 as the first variable
			commons = commonElements(Array2, Array1);
		}
		
		//Print the ArrayList
		System.out.println(commons);

	}

	static List<Integer> commonElements(int[] Array1, int[] Array2) {

		// Remake the arraylist
		List<Integer> commons = new ArrayList<>();

		// Start with array 1
		// For loop to run through each element of the array
		for (int i = 0; i < Array1.length; i++) {

			// Second for loop to check this number against the other Array
			for (int j = 0; j < Array2.length; j++) {

				// Check if the first array and second array numbers match
				if (Array1[i] == Array2[j]) {

					// Add to the commons arraylist
					commons.add(Array1[i]);
				}
			}

		}
		//Return the ArrayList
		return commons;

	}

}
