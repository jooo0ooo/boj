package _5554;

import java.util.Scanner;

public class _5554 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		
		int total = n1 + n2 + n3 + n4;
				
		System.out.println(total / 60);
		System.out.println(total % 60);
		
		s.close();
		
	}

}
