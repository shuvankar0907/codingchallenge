package sorting;

import java.util.Arrays;
/**
 * Interface for sorting algorithm
 * @author shuvankar
 *
 */
public interface Sorting {
	int[] sort(int[] data);

	default void display(int[] data) {
		Arrays.stream(data).forEach(System.out::println);
	}
}
