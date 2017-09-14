package javaAlgorithms;

/*What is an algorithm?
 * 
 * A series of steps you take to manipulate data
 *
 *what are Data Structures?
 * 
 * Just a way data is arranged in memory
 * 
 * What are the main data structures you need to know?
 * 
 * Inserting Values
 * Deleting Values
 * Searching for Values
 */

public class JavaAlgorithms {

	// Lets try print an array in a friendly way

	private int[] myArray = new int[100];

	private int size = myArray.length;

	// Make a class to populate the array

	private void populateArray() {

		for (int i = 0; i < size; i++) {

			myArray[i] = (int) (Math.random() * 50) + 1;
		}
	}
	
	/////////////////////////////////////////////////////////////////////

	// Print the array in a nice, friendly way

	private void printArray() {

		System.out.println("----------");

		for (int i = 0; i < size; i++) {

			System.out.println("| " + i + " || " + myArray[i] + " |");

			System.out.println("----------");
		}
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public int getIndexValue(int index){
		
		if(index < size)return myArray[index];
		return 0;
		
		
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public boolean containsValue(int value){
		
		boolean containsValue = false;
		
		for(int i = 0; i < size; i++){
			
			if(myArray[i] == value){containsValue = true;}
			
			
		}
		return containsValue;
	}
	
	
	/////////////////////////////////////////////////////////////////////
	
	public void deleteIndex(int index){
		
		if(index < size){
			
			for(int i = index; i < size - 1; i++){
				
				myArray[i] = myArray[i+1];
			}
			
			size--;
		}
		
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public void insertValue(int value){
		
		if(size < 50){
			
			myArray[size] = value;
			
			size++;
			
		}
	}
	
	
	/////////////////////////////////////////////////////////////////////
	
	public String linearSearch(int value){
		
		boolean containsValue = false;
		String index = "\n";
		
		for(int i = 0; i < size; i++){
			
			if(myArray[i] == value){
				
				containsValue = true;
				index = index + "| " + i + " || " + myArray[i] + " |\n";
				
			}
			
		}
		
		if(containsValue == false){
			
			index = "No Values Found";
		}
		
		return index;
	}
	
	/////////////////////////////////////////////////////////////////////
	public static void main(String[] args){
		
		//Create an instance of the class
		JavaAlgorithms myArray = new JavaAlgorithms();
		
		myArray.populateArray();
		
		myArray.printArray();
		
		System.out.println(myArray.getIndexValue(5));
		
		System.out.println("Contains Value: " + myArray.containsValue(20));
		
		myArray.deleteIndex(5);
		
		myArray.insertValue(10);
		
		myArray.printArray();
		
		System.out.println("Linear Search: " + myArray.linearSearch(22));
		
		
	}
	
	

}
