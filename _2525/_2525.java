package _2525;

import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		
		int resultHour, resultMinute;
		boolean carry = false;
		
		if(b + c % 60 >= 60) {
			resultMinute = (b + c % 60) % 60;
			carry = true;
		} else {
			resultMinute = b + c % 60;
		}
		
		if(a + (c / 60) + (carry ? 1 : 0) > 23) {
			resultHour = (a + c / 60 + (carry ? 1 : 0)) - 24;
		} else {
			resultHour = a + c / 60 + (carry ? 1 : 0);
		}
		
		System.out.println(resultHour + " " + resultMinute);
		
		s.close();
	}

}
