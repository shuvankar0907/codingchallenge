package problems;
/**
 * Problem:
 * Algorithm to check if two strings are anagram or not.
 * 
 * Solution:
 * This algorithm works by xoring the first string with 0 
 * The result is again XOR with second string 
 * If both strings are anagram then the result will be zero as result 1^1 and 0^0 is 0
 * @author Shuvankar Ghosh
 *
 */
public class AnagramCheck {
	public boolean isAnagram(String input1, String input2) {

		if (input1.length() != input2.length()) {
			return false;
		}
		int value = 0;
		for (int i = 0; i < input1.length(); i++) {
			value = value ^ ((int) input1.charAt(i));
			value = value ^ ((int) input2.charAt(i));
		}

		return value == 0;
	}
}
