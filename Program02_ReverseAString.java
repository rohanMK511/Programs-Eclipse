package javaPrograms;

public class Program02_ReverseAString {

	public static void main(String[] args) {
		
		//First get a String
		String first = "hello 1234";
		System.out.println("String before reverse : " + first);
		
		//Convert the String into new Character array such as char[] = {r,o,h,a,n}
		char[] charArray = first.toCharArray();
		
		//Apply for loop and iterate through the length of the charArray
		for (int i = first.length()-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//Reverse a Number
		//First get a number to reverse
		int number = 1234 ;
		System.out.println("Number before reverse : " + number);
		
		//Initialize the Reverse value to zero;
		int reverse=0;
		
		while(number != 0) {
			
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
			
		}
		System.out.println("Number After Reverse : " + reverse);
		
		/*
		for(; number!=0 ; number = number/10) {
			
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder; 
			
		}
		*/

	}

}
