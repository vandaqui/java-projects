package stringTypes;

import java.util.Arrays;


public class strings {

	public static void main(String[] args) {

		System.out.println("\n====String Methods====\n\n");
		
		String s = " hello ";
		
		// Count number of characters
		System.out.println("s.length(): " + s.length()); // 7
		
		// Compare "he" inside the string
		System.out.println("s.contains(\"he\"): " + s.contains("he")); // true 
		
		// The same as previous, but compares case sensitivity
		System.out.println("s.contains(\"he\"): " + s.contains("He")); // false
		
		// Contains any character
		System.out.println("s.isEmpty: " + s.isEmpty()); // false
		
		// Convert to UPPERCASE
		System.out.println("s.toUpperCase(): " + s.toUpperCase()); //HELLO
		
		// Check if the string starts with "h", false because starts with space
		System.out.println("s.startsWith(): " + s.startsWith("h")); // false
		
		// Check if the string ends with " " space
		System.out.println("s.endsWith(): " + s.endsWith(" ")); // true
		
		// Replace selected section of the string
		System.out.println("s.replace(): " + s.replace("ll", "LL")); // heLLo
		
		// Removes leading and trailing spaces
		System.out.println("s.trim(): " + s.trim()); // hello
		
		// Specify characters index from index
		System.out.println("s.substring(0, 3): " + s.substring(0, 3)); //  he

		// Convert string to array of bytes. Remember to import util.Arrays 
		System.out.println("Arrays.toString(s.getBytes()): " 
				+ Arrays.toString(s.getBytes())); // [32, 104, 101, 108, 108, 111, 32]
		
		// Convert to array of characters
		System.out.println("Arrays.toString(s.toCharArray()): " 
				+ Arrays.toString(s.toCharArray())); // [ , h, e, l, l, o,  ]
		
		// Get characters from specific index
		System.out.println("s.charAt(1): " + s.charAt(1)); // h
		
		// Split string by regular expression and get an array
		System.out.println("Arrays.toString(s.split(\"e\")): " 
				+ Arrays.toString(s.split("e"))); // [ h, llo ]
		
	}

}
