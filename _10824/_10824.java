package _10824;

import java.util.Scanner;

public class _10824 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		String b = s.next();
		String c = s.next();
		String d = s.next();
		
		String ab = a + b;
		String cd = c + d;
		
		System.out.println(Long.parseLong(ab) + Long.parseLong(cd));
		
		s.close();
		
	}

}
