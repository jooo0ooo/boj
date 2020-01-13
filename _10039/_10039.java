package _10039;

import java.util.Scanner;

public class _10039 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		
		System.out.println(((a < 40 ? 40 : a) + (b < 40 ? 40 : b) + (c < 40 ? 40 : c) + (d < 40 ? 40 : d) + (e < 40 ? 40 : e)) / 5);
		
	}

}
