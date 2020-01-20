package _1712;

import java.util.Scanner;

public class _1712 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		
		if(b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a / (c - b) + 1);
		}
		
		s.close();
	}

}
