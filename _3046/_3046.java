package _3046;

import java.util.Scanner;

public class _3046 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int r1 = s.nextInt();
		int average = s.nextInt();
		
		int r2 = 2 * average - r1;
		
		System.out.println(r2);
		
		s.close();
		
	}

}