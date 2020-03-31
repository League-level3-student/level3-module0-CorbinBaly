package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static String[] strings = new String[3];
	static Random rand = new Random();

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		strings[1] = "Hi";
		strings[2] = "Good to see you";
		strings[3] = "Hello";
		printStrings(strings);
		reverseStrings(strings);
		oddStrings(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseStrings(String[] strings) {
		for (int i = strings.length - 1; i >= 0; i++) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void oddStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i % 2 != 0) {
				System.out.println(strings[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomString(String[] strings) {
	for (int i = 0; i < strings.length; i++) {
		
	}
		int random = rand.nextInt(strings.length);
	
	}

}
