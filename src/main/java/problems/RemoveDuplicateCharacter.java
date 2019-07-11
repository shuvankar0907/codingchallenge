package problems;

import java.util.Arrays;
/**
 * Problem: Remove duplicate characters from string
 * Solution:
 * Integer is 32bits. Loop through all the characters.
 * Conter is used to claculate if the character is already found while scanning.
 * Ascii value of 'a' is 97. Convert all the characters to int and deduct 97 from it.
 * The value should be in the range 0-25. Take number 1 and shift it to the value.
 * Bitwise and operation with the counter will return 1 if at the same bit
 * already 1 is present that means the character is already present. In that case we ignore it and move ahead
 * If the value is zero character is added to the array and also in the counter that bit is set.  
 * 
 * @author ghosh
 *
 */
public class RemoveDuplicateCharacter {
	public String removeDuplicates(String input) {
		char[] inputarr=input.toCharArray();
		int counter=0;
		int i=0;
		int size =inputarr.length;
		int len=0;
		while(i<size) {
			int x=(int)inputarr[i]-97;
			if((counter & (1<<x))==0) {
				inputarr[len]=(char) (97+x);
				counter =counter | (1<<x);
				len++;
			}
			i ++;
			
		}
		
		char[] output=Arrays.copyOfRange(inputarr, 0, len);
		
		System.out.print(new String(output));
		
		return new String(output);
	}

}
