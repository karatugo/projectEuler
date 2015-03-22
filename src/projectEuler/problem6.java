package projectEuler;

import java.math.*;

public class problem6 {
	
	public static void main(String[] args) {
		
		int N = 100;
		
		System.out.println(sumSqDiff(N));
	}

	public static int sumSqDiff(int N) {
		
		int sumOfSquares = 0;
		int squareOfSums = 0;
		int sum = 0;
		
		for (int i = 1; i < N+1; i++) {
			sumOfSquares += Math.pow(i, 2);
			sum += i; 
		}
		
		squareOfSums = (int) Math.pow(sum, 2);
		return squareOfSums - sumOfSquares;
	}
}
