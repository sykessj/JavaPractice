package general6_elementOccursOnce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// Create the array
		int[] numberArray = { 1, 1, 2, 3, 3, 4, 4, 5 };

		// Create an arraylist to store the lone elements
		List<Integer> keyArrayList = new ArrayList<>();

		// Create a hash map to store values
		Map map = new HashMap();

		// create a key variable to store key later
		int key = 0;

		// for loop to save the occurences of each element
		for (int i = 0; i < numberArray.length; i++) {

			// Check if the current number is already in the hash map
			if (map.containsKey(numberArray[i])) {

				// Add one to the count
				map.put(numberArray[i], (int) map.get(numberArray[i]) + 1);

			} else {
				// Otherwise initilise the occurence
				map.put(numberArray[i], 1);
			}
		}

		// For loop to run through each map element
		for (int i = 0; i < numberArray.length; i++) {

			// Check if the current number is in the hash map
			if (map.containsKey(numberArray[i])) {

				// Check if the value is 1
				if ((int) map.get(numberArray[i]) == 1) {

					// Save the variable in the arraylist
					keyArrayList.add(numberArray[i]);
				}

			}

		}

		// Display the array list with lone elements
		System.out.println("Element to only occur once: " + keyArrayList);

	}

}

