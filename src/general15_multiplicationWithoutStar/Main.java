package general15_multiplicationWithoutStar;

public class Main {

	public static void main(String[] args) {
		
		//Create the two numbers to be multiplied
		int num1 = 5;
		int num2 = 7;
		
		//Create temporary versions of the variables for the calculations
		int temp1 = num1;
		int temp2 = num2;
		
		//Make the limit be temp2
		int limit = temp2;
		
		//If temp 2 if less than 0, make it positive because it is the limit
		if(temp2 < 0){
			//Changes the limit to a positive version of temp2
			limit = Math.abs(temp2);
			
			//Make the first number negative
			temp1 = -temp1;

		}
		
		//Variable to hold the answer;
		int answer = 0;
		
		//For loop to add the num1 to itself as many times as num2
		for(int i = 0; i < limit; i++){
			
			//Add num1 to the answer variable every loop
			answer = answer + temp1;
			}
		
		//Display the answer
		System.out.println(num1 + " X " + num2 + " = " + answer);

	}

}
