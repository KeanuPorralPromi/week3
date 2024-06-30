package week4;

public class coding_project {

	public static void main(String[] args) {
		
	//1. created an array by having [] after int which indicates it is an array.
		// i used {} to assign the 8 values as said in the question.
		
	   int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	   int firstElement = 0;
	   int lastElement = 0;
	//a.i created a two ints called first and last element.
	   // i assign the first and last elements in the array by using a traditional for loop.
	   for(int i = 0; i <= 0; i++) {
		 firstElement = (ages[i]);
	   }
		
	   for(int i = ages.length -1; i <= ages.length - 1; i++) {
			 lastElement = (ages[i]);
		   }
		
		System.out.println(firstElement -  lastElement);
				
	//b. like the previous array i used {} to assign the 9 values to the new array.
		int[] ages2 = {12, 50, 45, 30, 80, 75, 28, 2, 15}; //i.
		   int firstElement2 = 0;
		   int lastElement2 = 0;
	
		   for(int i = 0; i <= 0; i++) {                  //ii.
			 firstElement2 = (ages2[i]);
		   }
			
		   for(int i = ages2.length -1; i <= ages2.length - 1; i++) {
				 lastElement2 = (ages2[i]);
			   }
			
			System.out.println(firstElement2 -  lastElement2);
	 //iii. this for loop is capable of getting first and last element of any array.
			//as show above even though the second array has a lot more elements it was still able to work.
	
	//c. getting the average i used a for loop to add all the element using += and i divided it by the length of the array. 
		int sumOfArray = 0;
		for(int i = 0; i < ages2.length; i++) {
			sumOfArray += ages2[i];
			
		}
		System.out.println("Average age: " + sumOfArray / ages2.length);
	
	//2.like the arrays above i called the array using String[] and assign all string using {}.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//a.to get the average letters of the array i assign a new int called totalLettersOfArray
		//and then i used the the for loop and names.length to get the lengths of each individual array.
		//i added up all the letters and divided it by the length of the array
		int totalLettersOfArray = 0;
		for(int i = 0; i < names.length; i++) {
			totalLettersOfArray += names[i].length();
		}
		
		System.out.println("average letters per name: " + totalLettersOfArray / names.length);
		
		String namesTogether = "";
		
	//b.here i used an advance for loop, and added up all the names + " " which is a space so it can separated.
		for(String name : names) {
			namesTogether += name + " "; 
		}
		System.out.println(namesTogether);
		
	//3. an array will always start at 0
		System.out.println(names[0]);
	//4. last element will always be the length of array - 1.	
		System.out.println(names[names.length - 1]);
		
	//5.first i assigned array and used the length of names.array since it will be the same length.
		//here i used a traditional for loop so i can control the order of the array.
		//and then i assign each int array to the length of each string in the array.
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
	for(int length : nameLengths) {
		System.out.println(length);
	}	
	
	//6. like the previous questions above i assign an new int that will take the total of lengths.
		//i added up all the lengths but using a traditional for loop to go through all the lengths and add it up using +=.
	int sumOfLenghts = 0;
	for(int i = 0; i < nameLengths.length; i++) {
		sumOfLenghts += nameLengths[i];
	}
	System.out.println(sumOfLenghts);
	
	
	
	
	//starting here all methods will be in the bottom.
		
	//7.printout
	System.out.println(stringRepeat("Hello", 4));
		
	//8.printout	
	System.out.println(fullName("Keanu", "Porral"));	
	
	//9.printout
	System.out.println(moreThanOneHundred(ages));//true because it is more than one hundred.
	int[] arrayNum = {9, 5, 7, 8};
	System.out.println(moreThanOneHundred(arrayNum));//false because it is less.	
	
	//10.printout
	double[] prices = {10.50, 5.95, 8.76, 15.80, 26.40};
	System.out.println(averageDouble(prices));
	
	//11.printout
	double[] exampleOne = {5.50, 7.80, 9.50, 3.50};
	double[] exampleTwo = {3.30, 4.40, 2.30, 8.70};
	System.out.println(whichIsGreater(exampleOne, exampleTwo));// true because example one is greater than example two.
	System.out.println(whichIsGreater(exampleTwo, exampleOne));// false.
	
	//12.printout
	boolean isHotOutside = true;
	double moneyInPocket = 18.90;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));//true because isHotOutside = true AND moneyInPocket is greater than 10.50.
	isHotOutside = false;
	moneyInPocket -= 10.50;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));//change value for both boolean and double so it can check if will false when it doesn't meet the requirements.
	//13.printout
	String[] userNames = {"Dragon123", "Racer16", "Keanu12", "gamer19"};
	
	userNameUsed("Keanu12", userNames);
	
	
	} //7.This method will take in a String(word) and a int(for many times it will repeat).
		//i created a new string in the method called repeatedWord and then i used a traditional loop.
		//the for loop will allow me to iterate with what the value times has, and then word will keep added up to repeatedWord .
	public static String stringRepeat(String word, int times) {
		String repeatedWord = "";
		for(int i = 0; i < times; i++) {
			repeatedWord += word;
		}
		return repeatedWord;
	
	}//8.in this method it will take two strings and add it up together.
	  // i just did return and added up the two string with a space in the middle.
	public static String fullName(String first, String last) {
		
	return first + " " +last;	
	
	}//9.in this method it will check if the total of the array is more than 100.
	 // i first used a traditional for loop to add up the elements.
	// after i used a if statement to return the boolean values.
	//if it is greater than 100 it will return true if not, it will return false.
	public static boolean moreThanOneHundred(int[] num) {
		int totalInArray = 0;
		for(int i = 0; i < num.length; i++) {
			totalInArray += num[i];
		} if(totalInArray > 100) {
			return true;
		} else {
			return false;
		}
		
	}//10.in this method it will calculate the average of a double array.
	//i first created a double called total which will hold the total of array.
	// i used a tradition for loop to add up all the double in the array.
	//and then i return the total divided by the length of the array.
	public static double averageDouble(double[] prices) {
		double total = 0;
		for(int i = 0; i < prices.length; i++) {
			total += prices[i];
		}
	return total / prices.length;
	
	}//11.in this method it will take two double arrays and return the true if the first array is greater.
	//i assign a total and average for both double and used for loop to get it.
	// after that i used a if statement to return true or false.
	// true if the first array is greater then the second and false if second array is greater.
	
	public static boolean whichIsGreater(double[] x, double[] y) {
		double total1 = 0;
		double average1= 0;
		
		for(int i = 0; i < x.length; i++) {
			total1 += x[i];
		}
		average1 = total1 / x.length;
		
		double total2 = 0;
		double average2= 0;
		
		for(int i = 0; i < y.length; i++) {
			total2 += y[i];
		}
		average2 = total2 / y.length;
		
		if(average1 > average2) { 
			return true;
		}else {
			return false;
		}
		
	}//12.in this method it will take a boolean and double and return a boolean.
	//here i used if statement, returning true if it is hot outside and i have 10.50 in my pocket.
	//if either of them is not correct it will return false.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;	
		}else {
			return false;
		}
	}//13. in this method it will take a string and check if the Array String has elements that equal to it.
	//here i used a while loop and assigned an int counter to stop the loop
	//and then i use a for loop to iterate through the array.
	// used another for loop to check if my string matches with any of the element of the array.
	// if does equal to any of the elements it will add one to counter to stop the loop and print out "Username is taken"
	public static void userNameUsed(String newUserName ,String[] userNames) {
		
		int counter = 1;
		
		while(counter <= 1) {
			for(int i = 0; i < userNames.length; i++) {
				if(newUserName.equals(userNames[i])) {
					
				  counter++;
				  System.out.println("Username is taken");
				}
				
				
		
	}							 
			
	
}}}	
		
		
	
	
	
	
	

 
	
	
	
	
