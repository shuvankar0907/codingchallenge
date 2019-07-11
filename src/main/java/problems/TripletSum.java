package problems;

import java.util.Arrays;

/**
 * Problem:
 * Find the sum of three elements in the array that is equal to the target
 * @author Shuvankar Ghosh
 *
 */
public class TripletSum {
	public boolean tripletMatch(int[] arr, int target) {
		Arrays.sort(arr);
		int second, third, sum;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {

			second = i + 1;
			third = n - 1;
			while (second < third) {
				sum = arr[i] + arr[second] + arr[third];
				if (sum == target) {
					System.out.println("First: " + arr[i] + " Second: " + arr[second] + " Third: " + arr[third]);
					return true;
				}
				if (sum > target) {
					third--;
				} else if (sum < target) {
					second++;
				}
			}

		}
		return false;

	}
}
