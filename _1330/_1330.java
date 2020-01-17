package _1330;

import java.util.Scanner;

public class _1330 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(), 
			b = s.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		s.close();
		
	}

}