package javaPrograms;

public class Prog11_MSInterview {

	public static void main(String[] args) {

		// Write a code to count all the repeating Char from the String "I Work In
		// Morgan Stanley"
		String str = "I Work In Morgan Stanley";

		// Remove all the Spaces from the String and make it LowerCase to all the characters
		str = str.toLowerCase().replace(" ", "");
		
		// Iterate through each character in the string
		for(int i = 0 ; i < str.length() ;i++) {
			//Retrieve the Char at index i and assign it to the variable ch
			char ch = str.charAt(i);
			int count=0;
			
			// Count the occurrence of the current character in the string
			for(int j = 0 ; j<str.length() ;j++) {
				if(str.charAt(j)==ch) {
					count++;
				}
			}
			
			// Print the Character if the count repeats
			if(count>1) {
				System.out.println(ch + " : " + count);
			}
			
			// Set the count value to 0 to avoid recounting
			str = str.replaceAll(String.valueOf(ch), "");
		}

	}

}
