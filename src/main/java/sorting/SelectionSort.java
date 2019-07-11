package sorting;
/**
 * Selection Sort Algorithm
 * 1. In first pass smallest element is found
 * 2. Smallest element is swapped to the first pos 
 * 3. In the second pass second smallest element is found and swapped to send pos.
 * 4. Loops for n time, in each loop one element is sorted
 * 
 * 
 * Selection sort complexity is O(n square). 
 * Number of swaps are less and so it is better then bubble sort
 * 
 * @author Shuvankar Ghosh
 *
 */
public class SelectionSort implements Sorting{
	public int[] sort(int[] data) {
		int min = data[0];
		int minIndex = 0;
		boolean swapReqd=false;
		for (int i = 0; i < data.length ; i++) {
			swapReqd=false;
			 min = data[i];
			 minIndex = i;
			for (int j = i; j < data.length ; j++) {
				if (data[j] < min) {
					min = data[j];
					minIndex=j;
					swapReqd=true;
				}
			}
			if(swapReqd) {
				int temp=data[i];
				data[i]=data[minIndex];
				data[minIndex]=temp;
			}
			
		}
		
		 display(data);
		 
		 return data;
	}
}
