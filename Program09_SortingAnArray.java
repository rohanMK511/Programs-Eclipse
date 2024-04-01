package javaPrograms;

import java.util.Arrays;

public class Program09_SortingAnArray {

	public static void main(String[] args) {
		
		int[] array = {10,20,22,13,12,10,45,12,46};
		
		Arrays.sort(array);
		for(int i = 0 ; i < array.length ; i++) {

			System.out.println(array[i]);	
		}

	}

}
