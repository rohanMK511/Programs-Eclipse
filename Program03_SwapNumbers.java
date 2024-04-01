package javaPrograms;

public class Program03_SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Numbers before swapping : a = " + a + " b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Numbers After swapping : a = " + a + " b = " + b);
		
	}

}
