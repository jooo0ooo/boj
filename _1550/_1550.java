package _1550;

import java.util.Scanner;

public class _1550 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String hex = s.next();

		System.out.println(Integer.parseInt(hex, 16));
		
		s.close();
		
	}

}