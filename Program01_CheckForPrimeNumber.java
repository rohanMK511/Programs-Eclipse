package javaPrograms;

public class Program01_CheckForPrimeNumber {
	

	public static void main(String[] args) {

		int num = 1237;
		boolean isPrime = prime(num);
		
		if(isPrime) {
			System.out.println(num + " : is a prime number");
		}else
		{
			System.out.println(num + " : is not a prime number");
		}
	}

	public static boolean prime(int primeNum) {
		// Prime number is a number which is divisible by 1 or itself
		// 0 and 1 are not a prime number

		// Apply the logic to the integer
		for (int i = 2; i <= primeNum / 2; i++) {
			if (primeNum % i == 0) {
				return false;
			}
		}
		return true;
	}

}
