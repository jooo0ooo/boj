package _2845;

import java.util.Scanner;

public class _2845 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int p = s.nextInt();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		int n5 = s.nextInt();
		
		int sg = l * p;
		
		System.out.println((n1 - sg) + " " + (n2 - sg) + " " + (n3 - sg) + " " + (n4 - sg) + " " + (n5 - sg));
		
		s.close();
		
	}

}
