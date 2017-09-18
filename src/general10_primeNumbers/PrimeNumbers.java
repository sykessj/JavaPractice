package general10_primeNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//Set the amount of prime numbers to find
		int noPrime = 5000;
		
		//establise a count
		int count = 0;
		//Initalise the output variable
		String output = "";
		//Initialise the x variable
		int x = 2;
		
		//While the count is less than the amount of prime numbers wanted
		while (count < noPrime) {

			//returns true or false depending if the x variable is a prime number
			boolean prime = isPrime(x);

			//if it is a prime number add it to the output variable
			if (prime == true) {
				output = output + "(" + (count + 1) + ")" + " = " + x + "\n";
				//Add 1 to the count to take into account another prime number has been found
				count++;
			}
			
			//Add 1 to the x value and loop again
			x++;

		}
		//Print out the output variable
		System.out.println(output);

	}
	//Method to return true or false depending if a number is prime
	public static boolean isPrime(int x) {
		
		//Initalise the answer as being true
		boolean answer = true;

		//for loop starting at the number 2 and checking if it is divisible up to 20
		for (int i = 2; i <= 20; i++) {

			//Only test if it is not equal to itself
			if (x != i) {
				//if it is divisible to answer becomes false
				if (x % i == 0) {
					answer = false;
				}
			}

		}

		return answer;

	}

}
