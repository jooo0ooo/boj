package _10821;

import java.util.Scanner;

public class _10821 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String l = s.nextLine();
		
		System.out.println(l.length() - l.replace(",", "").length() + 1);
		
		s.close();
		
	}

}
