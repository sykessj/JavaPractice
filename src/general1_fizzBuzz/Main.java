package general1_fizzBuzz;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fizz Buzz");
		
		//I starts at 1 and increases by 1 each go until it reaches 50
		for(int i = 1; i <= 50; i++){
			//turns the integer to a string so it can be displayed easier
			String display = Integer.toString(i);
			//If the number i is divisible by 3: display string equals FIZZ
			if(i % 3 == 0){display = "FIZZ";}
			//If the number i is divisible by 5: the display string equals BUZZ
			if(i % 5 == 0){display = "BUZZ";}
			//If the number is is divisible by 3 and 5: the display string is FIZZBUZZ
			if((i % 3 == 0) && (i % 5 == 0)){display = "FIZZBUZZ";}
			//The final result is displayed and the loop goes back to beggining. 
			System.out.println(display);
		}

	}

}
