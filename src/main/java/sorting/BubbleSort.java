package sorting;

/**
 * Bubble Sort Algo steps
 * 1. Compare left element to right 
 * 2. If left is bigger then swap
 * 3. In first pass the biggest element will be on the rightmost position
 * 4. In the next pass the second biggest element is on the second rightmost position and so on
 * 
 * Time complexity in O(n square)
 * Extremely slow but easy to implement
 * Huge number of swaps
 * 
 * @author Shuvankar Ghosh
 *
 */
public class BubbleSort implements Sorting{
	public int[] sort(int[] data) {

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}

		display(data);
		return data;
	}
}
