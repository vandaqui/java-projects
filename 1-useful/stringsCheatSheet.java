package stringTypes;

public class strings {

	public static void main(String[] args) {

		System.out.println("\n====String Methods====\n\n");
		
		String s = " hello ";
		
		// Count number of characters
		System.out.println("s.length(): " + s.length()); // 7
		// Compare "he" inside the string
		System.out.println("s.contains(\"he\"): " + s.contains("he")); // true 
		// The same as previous, but case sentitive
		System.out.println("s.contains(\"he\"): " + s.contains("He")); // false
		//Contains any character
		System.out.println("s.isEmpty: " + s.isEmpty()); // false
	}

}
