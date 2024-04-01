package javaPrograms;

public class Program05_FibonnacciSeries {

	static int n1=0 ,n2=1 ,n3=0 ;
	static int a1=0 ,a2=1 ,a3=0;

	public static void main(String[] args) {
		
		//Fibonacci series , next number is the sum of previous 2 numbers
		int count = 12 ;
		
		//Fibonacci Series in Java without using recursion
		
		for(int i = 2 ; i < count ; i++) {
			
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
		
		//Fibonacci series in java using recursion
		primeRecursion(count - 2);
		

	}
	
	public static void primeRecursion(int count) {
		
		if(count >0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;	
			System.out.println(n3);
			primeRecursion(count - 1);
		}
		
	}

}
