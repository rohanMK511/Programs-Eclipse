package javaPrograms;

public class Program07_Palindrome {

	public static void main(String[] args) {
		
		//A String is said to be Palindrome if it is same from both ends such as madam : madam , navan : navan , navtvan : navtvan
		
		//Example
		String string = "1234321";
		String reverse = "";
		
		for(int i = string.length()-1 ; i>=0 ; i--) {
			reverse = reverse + string.charAt(i);
		}
		if(string.equals(reverse)) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}
}
