package sorting;

/**
 * Insertion sort Algorithm steps
 * 1.Sets a marked value. 
 * 2.Elements left to the marked values are always sorted
 * 3.Elements right to marked value are not sorted
 * 4. Marked index is moved from left to right
 * 5. Marked value is stored in a temp value 
 * 6. All elements in the left is shifted one cell right 
 * 7. Till any element less then the marked value is found
 * 8. In that case marked value is inserted in that position
 * 
 * Time complexity is O(n square). No swaps involve only shifting
 * Good for nearly sorted array with small dataset
 * No good for large dataset and where small vales are in the end
 * @author Shuvankar Ghosh
 *
 */

public class InsertionSort implements Sorting {

	@Override
	public int[] sort(int[] data) {
		int markerValue = -1;
		for (int i = 1; i < data.length; i++) {
			markerValue = data[i];
			for (int j = i - 1; j >= 0; j--) {
				if (data[j] > markerValue) {
					data[j + 1] = data[j];
				} else {
					data[j + 1] = markerValue;
					break;
				}
			}

		}

		display(data);
		return data;
	}

}
