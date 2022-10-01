package Wk4Notes;

public class Wk4CodingAssignment {

	public static void main(String[] args) {
//1 Created new array		Added my new number to array (66) in step 1. b.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 66};
	//a. Subtract the value of the first element from the last element (Method is listed in method section of code)
	System.out.println(getDifferenceFirstLast(ages));
	//b. Add an age to array and repeat step a.
	//c. Get the average age from the array.  PRINT (Method is listed in method section of code)
	System.out.println(getAverageAge(ages));
	
//2 Create an array of Strings containing given Strings
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//a.  Use a loop to find average # of letters in each String. PRINT (Method is listed in method section of code)
	System.out.println(getAverageStringLength(names));
	//b. Use a loop to concatenate all names in array separated by spaces. PRINT (Method is listed in method section of code)
	System.out.println(concatAll(names));

//3 I would access the last element of an array by using the code: arrayName[arrayName.length – 1]

//4	I access the first element of an array by using the code: arrayName[0]	
	
//5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
//  names array and add the length of each name to the nameLengths array (Method is listed in method section of code)
	int[] nameLengths = stringArrayToIntArray(names);

//6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in 
//  the array. PRINT
	System.out.println(sumOfIntArray(nameLengths));
//7 Write  a method that takes a String (word) and an int (n) as arguments and returns the word 
//  concatenated to itself n numbers of times.
//	(Method is listed in method section of code)
	String word = "Ho"; int n = 3;
	System.out.println(concatStringNTimes(word, n));
	
//8 Write a method that takes two Strings, firstName and lastName, and returns a full name
//	(Method is listed in method section of code)
	String firstName = "Adam";
	String lastName = "Moore";
	System.out.println(concatStrings(firstName, lastName));
	
//9 Write a method that takes an array of int and returns true if the sum of all the ints in the
//  array is greater than 100..  Method is listed below (In method section of code)
	System.out.println(isGreaterThan100(ages));
	
//10 Write a method that takes an array of double and returns the average of all the elements in array
//  Method is listed below (In method section of code)
	double[] array1 = {12.4, 16.4, 34.3, 2.4, 3.6, 45.6};
	System.out.println(getsAverageDouble(array1));
	
//11 Write a method that takes two arrays of double and returns true if the average of the elements 
//  in the first array is greater than the average of the elements in the second array. 
//  Method is listed below (In method section of code)
	double[] array2 = {13.7, 324.5, 436.34, 345.43, 346.45,};
	System.out.println(isFirstGreaterThanSecond(array2, array1));

//12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
//  and returns true if it is hot outside and if moneyInPocket is greater than 10.50
//  Method is listed below (In method section of code)
	double money = 12.75;
	boolean isHotOut = true;
	System.out.println(willBuyDrink(isHotOut, money));
	
//13 Create a method of your own that solves a problem.  In comments, write what the method does and 
//  why you created it.  Method is listed below (In method section of code)
	double paycheck = 3456.44; 
	System.out.println(enoughToCoverBills(array2, money, paycheck));
	}
	
	
//  Methods start here ----------------------------------------------------------------
	//Used in Q. 1. a.
	public static int getDifferenceFirstLast(int[] numbers) {
		// Here I create the integer:result by taking the last element in the array and
		// subtract the first element. Then I return the result of that.
		int result = (numbers[numbers.length - 1] - numbers[0]);
		return result;
	}
	//Used in Q. 1. b.
	public static double getAverageAge(int[] numbers) {
		int average= 0;					// created both ints average and sum
		int sum = 0;
		for (int number : numbers) {	//iterated through numbers adding number to the sum
			sum += number;
		} average = sum/numbers.length; // found the average by dividing the sum by the number of elements in numbers
		return average;
	}
	// Used in Q. 2. a.
	public static int getAverageStringLength(String[] strings) {
		int sum = 0; 					//created variable
		for(String string : strings) {  //iterated through strings and added the length of each string
		sum += string.length();			//to the sum
		} 
		int average = sum / strings.length;  //retrieved the average length of string of elements in strings
		return average;
	}
	// Used in Q. 2. b.
	public static String concatAll(String[] strings) {
		String result = "";				//created variable
		for (String string : strings) { //ran a loop to iterate through strings and added each string to the result
			result += string + " ";		// as well as a space between each
		}
		return result;
	}
	// Used in question 5 to help create the new int array
	public static int[]	stringArrayToIntArray(String[] strings) {
		//creates new int array and sets the array length to the length of the string array length
		int[] intArray = new int[strings.length];  
		for (int i = 0; i <= strings.length - 1; i++) { 
			intArray[i] = strings[i].length();   //use a loop to add numbers to each element of intArray
		}
		return intArray;
	}
	// Used in Q. 6 to calculate the sum all of the elements in the array.
	public static int sumOfIntArray(int[] num) {
		int sum = 0;  //create variable
		for (int number : num) {  //create loop
			sum += number;  //add every element of array to existing sum variable
		}
		return sum; //returns sum
	}
	//  Used in Q. 7
	public static String concatStringNTimes(String word, int n) {
		String result = "";  // created variable
		for (int i = 0; i < n; i++) {  //created loop, limiting loop to n number of times
			result += word;  //concatenated word on top of itself n number of times
		} 
		return result;
	}
	//  Used in Q. 8  
	public static String concatStrings(String firstName, String lastName) {
		String fullname = firstName + " " + lastName; // adds two strings together to make new String with space
		return fullname;
	}
	//  Used in Q. 9
	public static boolean isGreaterThan100(int[] num) {
		int sum = 0; 			  // create int sum
		for (int number : num) {  //iterate through num and add each number to the sum
			sum += number;
		} if (sum > 100) {        // establish conditions for boolean
			return true;
		} else return false;
	}
	//  Used in Q. 10
	public static double getsAverageDouble(double[] numbers) {
		double sum = 0;					  // create double sum
		for(double number : numbers) {    // iterate through numbers and add each number to the sum
			sum += number;
		}
		return sum / numbers.length;      // find and return the average double
	}
	//  Used in Q. 11
	public static boolean isFirstGreaterThanSecond(double[] numbers1, double[] numbers2) {
		double sum1 = 0;						// created both variables sum 1 and sum2
		double sum2 = 0;
		for (double number1 : numbers1) {		// iterated through numbers1 and added each number1 to sum1
			sum1 += number1;
		} 
		for (double number2 : numbers2) {		// iterated through numbers2 and added each number2 to sum2
			sum2 += number2;
		}
		double average1 = sum1/numbers1.length; //created average1 and average2 using both sums and the 
		double average2 = sum2/numbers2.length; // lengths of each array.
		if (average1 > average2) {				
			return true;						//returned boolean value true if the first average was bigger
		} else {								// than the second
			return false;
		}
	}
	//  Used in Q. 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) { 
			return true;            // Will buy a drink (return true) if I have over 10.50 in cash
		} else {					// and it is true that it is Hot Outside
			return false;
		}
	}
	// Used in Q. 13
	// I created this method to figure out if my bank account and my upcoming paycheck would give me
	// enough money in it to cover my long array of bills
	public static boolean enoughToCoverBills(double[] bills, double bankAccount, double paycheck) {
		double billsSum = 0;
		for (double bill : bills) {		// Ran through array of bills and added each bill to the sum
			billsSum += bill;
		} if (billsSum <= bankAccount + paycheck) { 
			return true;				// If I have more or the same amount of money in my bank and 
		} else {						// in my paycheck, it is true I can pay my bills
			return false;
		}
	}

}
