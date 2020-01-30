package _10808;

import java.util.Scanner;

public class _10808 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String sentence = s.next();
		int alphabet[] = new int[26];
		
		for(int i = 0; i < sentence.length(); i++) {
			alphabet[sentence.charAt(i) - 97] = alphabet[sentence.charAt(i) - 97] + 1;
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println();
		
		s.close();
		
	}

}
