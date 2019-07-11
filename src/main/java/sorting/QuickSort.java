package sorting;

/**
 * This class defines quick sort algorithm.
 * Last element is chosen as the Pivot element
 * Quick Sort is a divide and conquer algorithm
 * Algorithm works on dividing the array into two parts and running the partition logic
 * After every pass pivot element will in its correct position
 * Partition Logic is as follows:-
 * There are two pointers left and right
 * Left pointer will move from left to right. It will compare the element with pivot element
 * if value is less than pivot than the pointer is incremented, else it is swapped with the element pointed
 * by right pointer 
 * Similarly Right pointer will kove from right to left. It will compare the element with pivot element,
 * if the value is more than pivot than the pointer is decremented,else it is swapped with the element pointed
 * by the left pointer
 * 
 * Average and Best Time Complexity is O(nlog(n)) space Complexity is O(1)
 * Worst case is O(n 2). When the elements are sorted and pivot is the extreme last
 * @author Shuvankar Ghosh
 *
 */
public class QuickSort implements Sorting{
	@Override
	public int[] sort(int[] data) {

		quickSortAlgo(data,0,data.length-1);
		display(data);
		return data;
	}
	
	private void quickSortAlgo(int[] data,int left, int right) {
		if(left>=right) {
			return;
		}
		int pivot=partison(data, left, right);
		quickSortAlgo(data, left, pivot-1);
		quickSortAlgo(data, pivot+1, right);
		
	}

	private int partison(int[] data, int low, int high) {
		int pivot = data[high];
		//int pivotIndex = right;
		int right = high - 1;
		int left=low;
		while (true) {
			while (left < high && data[left] < pivot) {
				left++;
			}

			while (right >= low && data[right] > pivot) {
				right--;
			}

			if (left >= right) {
				swap(data, left, high);
				break;
			}
			
			swap(data,left,right);
		}

		return left;
	}

	private void swap(int[] data, int left, int right) {
		int temp = data[left];
		data[left] = data[right];
		data[right] = temp;
	}
}
