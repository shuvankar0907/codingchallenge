package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Given a string, find all the anagram 
 * Solution:
 * Break it into a tree. 
 * Interchange the first character with the next elements
 * Create the next level of children by making the first element fixed
 * Rearrange the interchange elements
 * Repeat till all the elements are fixed
 * @author Shuvankar Ghosh
 *
 */
public class Anagram {
	private List<String> anagrams = new ArrayList<String>();
	private int inputLen = 0;

	public void anagram() {
		String text = "abcd";
		char[] arrChar = text.toCharArray();
		inputLen = arrChar.length;
		anagramAlgo(arrChar, text.length());

		anagrams.stream().forEach(System.out::println);

	}

	private void anagramAlgo(char[] arrChar, int size) {
		if (size == 1) {
			anagrams.add(new String(arrChar));
			return;
		}
		for (int i = inputLen - size; i < inputLen; i++) {
			rotate(arrChar, inputLen - size, i);
			anagramAlgo(arrChar, size - 1);
			rotate(arrChar, i, inputLen - size);
		}

	}

	private void rotate(char[] arrChar, int index1, int index2) {
		char temp = arrChar[index1];
		arrChar[index1] = arrChar[index2];
		arrChar[index2] = temp;
	}
}
