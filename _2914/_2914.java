package _2914;

import java.util.Scanner;

public class _2914 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int songs = s.nextInt();
		int copyright = s.nextInt();
		
		int melody = songs * (copyright - 1) + 1;
		
		System.out.println(melody);
		
		s.close();
		
	}

}