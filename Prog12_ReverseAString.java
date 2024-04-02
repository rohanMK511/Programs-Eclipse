package javaPrograms;

public class Prog12_ReverseAString {
	
	public static void main(String[] args) {
		
		// Using StringBuffer
		/*
		String str = "I am Working in TCS";
		
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		System.out.println(buffer);
		*/
		
		//Using Normal conditional statement
		/*
		//Initialize the String
		 String str = "I Am Working In TCS", rstr="";
		 
		 //Iterate each char through the length of the string
		 for(int i = 0 ; i < str.length() ; i++) {
			 //Extract the each char
			 char ch = str.charAt(i);
			 //add the each char in front of the existing char
			 rstr = ch + rstr;
		 }
		 System.out.println(rstr);
		 */
		
		//Using another simple method using conditional statement
		String str = "I Am Working In TCS";
		
		char[] ch = str.toCharArray();
		
		for(int i = ch.length - 1 ; i >= 0 ; i--) {
			System.out.print(ch[i]);
		}
		
		
	}

}
