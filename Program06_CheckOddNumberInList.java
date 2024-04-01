package javaPrograms;

import java.util.List;

public class Program06_CheckOddNumberInList {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,3,5,7,8);
		if(isOdd(list)) {
			System.out.println("The List contains only Odd numbers");
		}
		else{
			System.out.println("The list contains atleast one odd number");
		}
	}

	public static boolean isOdd(List<Integer> list) {
		for(int i : list) {
			if(i % 2 == 0)
			{
				return false;
			}
		}
		return true;
	}
}
