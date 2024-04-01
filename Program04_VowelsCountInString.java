package javaPrograms;

public class Program04_VowelsCountInString {

	public static void main(String[] args) {
		
		//String to be counted for Vowels.
		String string = "'Rohan Khot'";
		int count = 0 ;
		
		//String converted to lower case before check
		string.toLowerCase();
		
		for(int i = 0 ; i < string.length() ; i++) {
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') {
				count = count + 1;
			}
		}
		System.out.println("The Vowel count in the string "+ string +" is : " +count);

	}

}
