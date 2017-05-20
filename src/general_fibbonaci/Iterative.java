package general_fibbonaci;

public class Iterative {

	public static void main(String[] args) {
		
		//Create the intial values and the limit
		int num1 = 1;
		int num2 = 1;
		int limit = 15;
		
		System.out.print(num1 + ", " + num2 + ", ");
		
		//For loop for running through the numbers up to the limit
		for(int i = 0; i <= limit; i++){
			
			//get the next number by adding the 2 previous numbers
			int nextNumber = num1 + num2;
			
			//Print the next number in the sequence
			System.out.print(nextNumber + ", ");
			
			//Change num1 to num2
			num1 = num2;
			
			//Change num2 to the new number in the sequence
			num2 = nextNumber;
			
		}

	}

}
