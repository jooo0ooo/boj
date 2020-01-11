package _1152;

import java.util.Scanner;

public class _1152 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String sentence = s.nextLine();
		int wordLength = sentence.length();
		int spaceCount = 0;
		
		for(int i = 0; i < wordLength; i++) {
			if(sentence.charAt(i) == ' ') {
				spaceCount++;
				if(i == 0 || i == wordLength - 1) {
					spaceCount--;
				}
			}
			
		}
		
		System.out.println(wordLength == 1 && sentence.charAt(0) == ' ' ? 0 : spaceCount + 1);
		
	}

}