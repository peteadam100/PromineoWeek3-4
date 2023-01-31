package assignment;

import java.io.IOException;
import java.util.Arrays;

public class Week4Assignment {
	public static void main(String[] args) throws IOException {
		boolean pauses = true;
		//1
		//setup initial array
		int[] ages = {3,9,23,64,2,8,28,93};
		//1.a
		System.out.println("1.a \n ---Array 1 ages subtracted:");
		System.out.println("\tArray used: " + Arrays.toString(ages));
		System.out.println("\tResult: " + SubtractAges(ages));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		
		//1.b
		//created new array for adding a new value
		int[] ages2 = {3,9,23,64,2,8,28,93,100};
		System.out.println("1.b \n ---Array 2 ages subtracted:");
		System.out.println("\tArray used: " + Arrays.toString(ages2));
		System.out.println("\tResult: " + SubtractAges(ages2));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();};
		
		//1.c
		System.out.println("1.c \n ---Average of numbers in age array:");
		System.out.println("\tArray used: " + Arrays.toString(ages2));
		System.out.println("\tResult: " + CalculateAverageAges(ages2));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//2
		String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//2.a
		System.out.println("2.a \n ---Rounded average character length of names:");
		System.out.println("\tArray used: " + Arrays.toString(names));
		System.out.println("\tResult: " + CalculateAverageNameLength(names));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//2.b
		System.out.println("2.b \n ---Concatenated names separated by spaces:");
		System.out.println("\tArray used: " + Arrays.toString(names));
		System.out.println("\tResult: " + ConcateNames(names));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//3
		System.out.println("3 \n ---Access the last element of an array using the Array.length property to pass the last index position to the array");
		System.out.println("\tYou must do the length property minus 1 however because the index positions are 0 based, but the length is not.");
		System.out.println("\tArray used: " + Arrays.toString(names));
		System.out.println("\t" + "EXAMPLE:\tnames[names.length - 1] \treturns: " + names[names.length - 1]);
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//4
		System.out.println("4 \n ---Access the first element of an array by referencing the index position 0.");
		System.out.println("\tArrays are 0 based and if they have been initialized, will always start with 0.");
		System.out.println("\tArray used: " + Arrays.toString(names));
		System.out.println("\t" + "EXAMPLE:\tnames[0] \treturns: " + names[0]);
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//5
		int[] nameLengths = new int[names.length];
		System.out.println("5 \n ---Building array of name lengths");
		System.out.println("\tUsing names array: " + Arrays.toString(names));
		System.out.println("\tFirst initialized: " + Arrays.toString(nameLengths));
		BuildNameLengthsArray(nameLengths, names);
		System.out.println("\tAfter setting values: " + Arrays.toString(nameLengths));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//6
		System.out.println("6 \n ---Total characters used in names array:");
		System.out.println("\tUsing names array: " + Arrays.toString(names));
		System.out.println("\t" + SumIntArray(nameLengths));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//7
		String myWord = "Promineo";
		int wordTimes = 7;
		System.out.println("7 \n ---Method to concatenate a word a specified number of times: ");
		System.out.println("\tEXAMPLE:\t word: " + myWord + " \t repeated: " + wordTimes + " times");
		System.out.println("\t - " + ConcateWord(myWord, wordTimes));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//8
		String firstName = "Adam";
		String lastName = "Petersen";
		System.out.println("8 \n ---First and Last Name to create full name:");
		System.out.println("\tFirst Name: " + firstName);
		System.out.println("\tLast Name: " + lastName);
		System.out.println("\t\tConcatenated: " + FullName(firstName, lastName));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//9
		System.out.println("9 \n ---Is the array greater than 100?" );
		System.out.println("\tused the ages2 array for example: " + Arrays.toString(ages2) + "\tSum: " + SumIntArray(ages2));
		System.out.println("\tResult: " + IsArrayGreaterThan100(ages2));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//10
		double[] myDoubles = {15.5,13.4,1.5,37.4,6.1,8.8,4.68,61.3};
		System.out.println("10 \n ---Average of an array of doubles:");
		System.out.println("\tArray used: " + Arrays.toString(myDoubles));
		System.out.println("\tResult: " + AverageOfDoubleArray(myDoubles));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//11
		double[] myDoubles2 = {1.6,5.7,8.1,6.1,2.9,9.47,15.4}; 
		System.out.println("11 \n ---Is the first array average greater than the second?");
		System.out.println("\tArray 1 used: " + Arrays.toString(myDoubles) + "\t Average: " + AverageOfDoubleArray(myDoubles));
		System.out.println("\tArray 2 used: " + Arrays.toString(myDoubles2) + "\t Average: " + AverageOfDoubleArray(myDoubles2));
		System.out.println("\tResult: " + Array1Geater(myDoubles, myDoubles2));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//12
		boolean isHotOutside = true;
		double moneyInPocket = 15.0;
		System.out.println("12 \n ---Will I buy a drink?");
		System.out.println("\tFirst condition - is it hot outside: " + isHotOutside);
		System.out.println("\tSecond condition - do I have enough money: " + moneyInPocket);
		System.out.println("\tResult: - Buy Dink? \t" + WillBuyDrink(isHotOutside, moneyInPocket));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
		
		//13
		int arrSize = 5;
		System.out.println("13 \n ---Create my own method");
		System.out.println("\tThis method creates an array of random integers between 0 and 100. Pass the size of the array that you want.");
		System.out.println("\tI created this method to create int arrays instead of initializing them myself");
		System.out.println("\tResult:\tCreated array: " + Arrays.toString(CreateIntArray(arrSize)));
		System.out.print("   ----- Press Enter to continue-----");
		if (pauses) {System.in.read();}
		if (pauses) {System.in.read();}
	}
	
	private static int[] CreateIntArray(int arrSize) {
		int[] intArr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			intArr[i] = (int)(Math.random()*100);
		}
		return intArr;
	}

	private static boolean WillBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean Array1Geater(double[] arr1, double[] arr2) {
		if (AverageOfDoubleArray(arr1) > AverageOfDoubleArray(arr2)) {
			return true;
		} else {
			return false;
		}
	}

	private static double AverageOfDoubleArray(double[] myDoubles) {
		double sum = 0;
		for (double num : myDoubles) {
			sum += num;
		}
		return sum / myDoubles.length;
	}

	private static boolean IsArrayGreaterThan100(int[] arr) {
		if (SumIntArray(arr) > 100) {
			return true;
		} else {
			return false;
		}
	}

	private static String FullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	private static String ConcateWord(String word, int numTimes) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < numTimes; i++) {
			builder.append(word);
		}
		return builder.toString();
	}

	private static int SumIntArray(int[] nameLengths) {
		int total = 0;
		for (int length : nameLengths) {
			total += length;
		}
		return total;
	}

	private static void BuildNameLengthsArray(int[] nameLengths, String[] names) {
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
	}

	private static String ConcateNames(String[] names) {
		StringBuilder combinedNames = new StringBuilder();
		for (String name : names) {
			if (combinedNames.toString().equals("")) {
				combinedNames.append(name);
			} else {
				combinedNames.append(" " + name);
			}
			
		}
		//System.out.println("in method " + combinedNames);
		return combinedNames.toString();
	}

	private static double CalculateAverageNameLength(String[] names) {
		int charCount = 0;
		for (String name : names) {
			charCount += name.length();
		}
		//System.out.println("Total Characters in array: " + charCount + " Number of names: " + names.length);
		//System.out.println(Math.round((double)charCount * 100) /names.length / 100.0);
		//return (double)charCount / names.length;
		return Math.round((double)charCount * 1000) /names.length / 1000.0;
	}

	private static double CalculateAverageAges(int[] array) {
		int sum = 0;
		for (int age : array) {
			sum += age;
		}
		//System.out.println("sum: " + sum + " length: " + array.length);
		//cast the sum variable to a double for accuracy - and for fun
		//System.out.println((double)(sum) / array.length);
		return (double)(sum) / array.length;
	}

	public static int SubtractAges(int[] array) {
		//System.out.println(array[array.length -1] - array[0]);
		return array[array.length -1] - array[0];
	}
	
}
