package _17496;

import java.util.Scanner;

public class _17496 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(),
			t = s.nextInt(),
			c = s.nextInt(),
			p = s.nextInt();
		
		System.out.println((n - 1) / t * c * p);
		
	}

}