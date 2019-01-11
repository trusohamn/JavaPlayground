package com.trusohamn.skyline;

import java.util.Scanner;

public class App {
	static final int maxStrokesNumber =  1000000000;
	
	/**
	 * @param A size of A is an integer within the range [1..100,000]. Each element of array A is an integer within the range [1…1,000,000,000] 
	 * @return strokes count or -1 if maxStrokesNumber is exceeded
	 * function counts the 'incrementing steps' of array A
	 */
	public static int solution(int [] A) {
		int count = 0;
		int prevA = 0;
		for (int a : A) {
			if (a > prevA) {
				count = count + (a - prevA);
			}
			if (count > maxStrokesNumber) return -1;
			prevA = a;
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a sequence of integers within the range 1:1,000,000,000 and hit Enter");
		 //retrive array of integers
		 Scanner s = new Scanner(System.in);
		 String input =  s.nextLine();
		 //any nonnumerical separator can be used
		 String[] stringA = input.split("\\D+");

		 int[] A = new int[stringA.length];
		 for (int i = 0; i < stringA.length; i++) {
			 A[i] = Integer.parseInt(stringA[i]);
		 }
		 //count the strokes
		 int count = solution(A);
		 System.out.println(count >= 0 ? "Number of strokes: " + count : "Exceeded max number of strokes");
		 s.close();
	}

}
