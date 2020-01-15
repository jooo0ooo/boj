package _15727;

import java.util.Scanner;

public class _15727 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int l = s.nextInt();
		
		System.out.println((l / 5) + (l % 5 == 0 ? 0 : 1));
		
	}

}