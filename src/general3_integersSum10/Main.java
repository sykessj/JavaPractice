package general3_integersSum10;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//Create a hash map to save integers
		Map map = new HashMap();
		
		//Create a for loop that goes from 0 to 10
		for(int i = 0; i <= 10; i++){
			
			//Start a second for loop for the second integer
			for(int j = 0; j <= 10; j++){
				
				//Find the sum of the integers
				int sum = i + j;
				
				//Check if the sum is 10
				if(sum == 10){
					map.put(i, j);
				}
				
			}
			
		}
		
		//Display the integers that sum to 10
		System.out.println(map);
		
	}

}
