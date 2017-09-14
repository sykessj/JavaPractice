package strings3_anagrams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class main {

	public static void main(String[] args) {
	
		int seconds = 1498500568;
		
		
		
		int input = normalise(seconds);

}
	
	public static int add(int x, int y){
		
		int ans = x + y;
		
		return ans;
		
	}
	
	//for normal addition 
	@Test
	public void testAdd1Plus1() 
	{
	    int x  = 1 ; int y = 1;
	    assertEquals(3, main.add(x,y));
	}
	
	public static int normalise(int input_time){
		
		//First find the number of years
		int years = input_time / (365*24*60*60);
		//remaining inputTime
		input_time = input_time - (years * 365*24*60*60);
		
		System.out.println("years: " + years);
		
		//Months remaining
		int months = input_time / ((365*24*60*60) / 12);
		//Remaining input time
		input_time = input_time - (months * ((365*24*60*60) / 12));
		
		System.out.println("Months: " + months);
		
		//Days remaining
		int days = input_time / (24*60*60);
		//Remaining input time
		input_time = input_time - days * (24*60*60);
				
		System.out.println("Days: " + days);
		
		//Days remaining
		int hours = input_time / (60*60);
		//Remaining input time
		input_time = input_time - hours * (60*60);
						
		System.out.println("Hours: " + hours);
		
		//Minutes remaining
		int minutes = input_time / (60);
		//Remaining input time
		input_time = input_time - minutes * (60);
								
		System.out.println("Minutes: " + minutes);
		
		return input_time;
	}
	
	public static void q6(){
		int a = 2;
		int b = 0;
		int c = -1;
		
		for(b = 0; a < 12; b++){
			System.out.println("a = " + a + " b = " + b + " c = " + c);
			a = (a + a) * c;
			
		}
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
	
}
