package javaPrograms;

public class Program10_FactorialOfAnInteger {

	public static void main(String[] args) {
		
		//Factorial of an integer is the Product of all positive descending integers such as : 4! = 4*3*2*1 , 5! = 5*4*3*2*1
		
		int number=5 , fact=1;
		for(int i = 1; i<=number ; i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of the Number "+ number +" is "+fact);
	}

}
