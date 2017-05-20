package general_arrayFrequency;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// Create the variables to hold the key and the highest number later
		int highestValue = 0;
		int key = 0;

		// Create the initial array
		int[] numberArray = { 1, 1, 2, 2, 2, 3, 4, 4, 7, 8, 8, 8, 8 };

		// Create the hash map
		Map map = new HashMap();

		// A for loop starting a 0 thats repeats until it ends the array
		for (int i = 0; i < numberArray.length; i++) {
			// Check if the current number is already in the hash map
			if (map.containsKey(numberArray[i])) {
				// If it is Add to the count
				map.put(numberArray[i], (int) map.get(numberArray[i]) + 1);

			} else {
				// if it isnt initialise the count at 1
				map.put(numberArray[i], 1);
			}

		}

		// A second for loop that does the same as the first
		for (int i = 0; i < numberArray.length; i++) {

			// Check if the current value is higher than the highest recorded
			// value
			if ((int) map.get(numberArray[i]) > highestValue) {
				// If it is, the highest value variable is replaced with the
				// current value
				highestValue = (int) map.get(numberArray[i]);
				// Saves the current key
				key = numberArray[i];

			}

		}

		// Displays the most common value
		System.out.println("Most frequent number: " + key);

	}

}
