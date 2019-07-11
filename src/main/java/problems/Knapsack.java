package problems;

import java.util.Arrays;
import java.util.Stack;
/**
 * Problem:
 * Given a set of number and the target, find the combination of numbers where the sum of the numbers is equal to the target.
 * If the target is not found return false.
 * Algo:
 * 1. take first element and push in stack comb. Insert the index of the element in another stack
 * 2. Loop over other elements until sum is greater than the target
 * 3. In that case pop the element and the index and get the next element by adding to index and push it to stack
 * 4. If it is the last element is reached pop the stack and set counter(j) to index(poped from index stack)+1
 * 5. Stack will be empty if the target is not found. Means the first elemnt is not part of the target
 * 6. it will come out of while loop and continue with for loop and will take next element as fixed
 * @author Shuvankar Ghosh
 *
 */
public class Knapsack {
	private static Stack<Integer> comb = new Stack<Integer>();
	private static Stack<Integer> index = new Stack<Integer>();

	public void findTarget() {
		int[] arr = { 10, 8, 7, 6, 5 };

		Arrays.sort(arr);
		boolean targetFound=algo(arr, 0);
		if(targetFound) {
			System.out.println("Traget Found");
		}
		else {
			System.out.println("Traget not Found");
		}

		while (!comb.isEmpty()) {
			System.out.println(comb.pop());
		}
	}

	public boolean algo(int[] arr, int target) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			comb.clear();
			index.clear();
			sum = 0;
			if (arr[i] > target) {
				continue;
			}
			if (arr[i] == target) {
				comb.push(arr[i]);
				return true;

			}
			if (arr[i] < target) {
				comb.push(arr[i]);
				index.push(i);
				sum += arr[i];
			}
			int j = i + 1;
			while (!comb.isEmpty() && j<arr.length) {
				if (target > sum + arr[j]) {
					if (j >= arr.length-1) {
						int num = comb.pop();
						sum -= num;
						int ind = index.pop();
						j = ind + 1;
					} else {
						sum += arr[j];
						comb.push(arr[j]);
						index.push(j);
						j++;
					}
				} else if (target < sum + arr[j]) {
					int num = comb.pop();
					sum -= num;
					int ind = index.pop();
					j = ind + 1;
				} else if (target == sum + arr[j]) {
					comb.push(arr[j]);
					return true;
				}
				
			}
		}
		comb.clear();
		index.clear();
		return false;
	}
}
