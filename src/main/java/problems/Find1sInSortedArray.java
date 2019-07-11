package problems;

/**
 * Problem: Find the 1's in a sorted array 
 * Solution: Binary search the array for 1
 * 
 * 
 * @author Shuvankar Ghosh
 *
 */
public class Find1sInSortedArray {
	public void finOnes() {
		int[] arr = { 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 };
		int maxPosOfOne = binarySearchOnes(arr, 0, arr.length - 1);
		System.out.println(maxPosOfOne);
	}

	public int binarySearchOnes(int[] arr, int low, int high) {
		int mid = (high + low) / 2;
		int midValue = arr[mid];
		if (midValue == 1 && arr[mid + 1] == 0) {
			return mid + 1;
		}

		if (midValue == 1) {
			return binarySearchOnes(arr, midValue + 1, arr.length - 1);
		}

		else {
			return binarySearchOnes(arr, 0, midValue - 1);
		}
	}
}
