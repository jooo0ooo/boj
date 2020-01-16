package _10872;

import java.util.Scanner;

public class _10872 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 1;
		
		for(int i = 1; i < n + 1; i++) {
			result *= i;
		}
		
		
		System.out.println(result);
		
		s.close();
		
	}

}
