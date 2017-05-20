package general_fibbonaci;

public class Recursive {

	public static void main(String[] args)
	{
		//Initalise the index variable
	    int index = 0;
	    
	    //A while (true) loop means it loops forever
	    while (true)
	    {
	    	//Print the result of the fibonacci method with the index variable
	        System.out.println(fibonacci(index));
	        
	        //Increase the index variable by 1
	        index++;
	    }
	}
	
	//the fibonnaci method returning a long integer and taking an integer
	    public static long fibonacci (int i)
	    {
	    	//If i is 0, it returns 0; if i is is less than or equal to 2, it returns 1;
	    	//Fib always boils down to returning 0 or 1
	        if (i == 0) return 0;
	        if (i <= 2) return 1;

	        //adds the two previous together as long as the number was not 2 or less
	        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
	        //Returns the new number
	        return fibTerm;
	    }
	    
	    //Basically always falls to 1 or 0 and adds together
	    
	    //fib(0) = returns 0
	    //fib(1) = returns 1
	    //fib(2) = returns 1
	    //fib(3) = fib(2) + fib(1) = 1 + 1 = 2
	    //fib(4) = fib(3) = fib(2) = 2 + 1 = 3
	    //fib(5) = fib(4) + fib(3) = 3 + 2 = 5
	    //fib(6) = fib(5) + fib(4) = 5 + 3 = 8
	    

}
