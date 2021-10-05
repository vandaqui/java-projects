package stringTypes;

public class StrinigComparison {

	public static void main(String[] args) {

		System.out.println("\n==== String Comparison ====\n");
		
		String s = " hello ";
		
		// Compare both s and s2 strings
		String s2 = " hello ";
		System.out.println("s == s2: " + (s == s2)); // true

		
		String s3 = new String(" hello ");
		// Is in a different position in the heap
		System.out.println("s == s3: " + (s == s3)); // false
		// True because the strings are equal
		System.out.println("s.equals(s3): " + s.equals(s3)); // true
		// Puts the s3 in the pool and return the reference in the string pool
		System.out.println("s == s3.intern(): " + (s == s3.intern()));	// true
		
		String firstName = "Andrii";
		String firstName2 = "andrii";
		// Capital "A" returns false
		System.out.println("firstName.equals(firstName2): " 
				+ firstName.equals(firstName2)); // false
		// Ignore case sensitivity
		System.out.println("firstName.equalsIgnoreCase(firstName2): " 
				+ firstName.equalsIgnoreCase(firstName2)); 	// true
	
	}

}
