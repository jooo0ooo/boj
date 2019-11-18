package _2475;

import java.util.Scanner;

public class _2475 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		int s4 = s.nextInt();
		int s5 = s.nextInt();
		
		int result = (s1 * s1 + s2 * s2 + s3 * s3 + s4 * s4 + s5 * s5) % 10;
		
		System.out.println(result);
		
		s.close();
		
	}

}