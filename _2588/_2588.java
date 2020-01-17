package _2588;

import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt(), 
			b = s.nextInt();
		
		int bFirst = b / 100, bSecond = (b/ 10) % 10, bThird = b % 10;
		
		int firstData = a * bThird;
		int secondData = a * bSecond;
		int thirdData = a * bFirst;
		
		System.out.println(a * bThird);
		System.out.println(a * bSecond);
		System.out.println(a * bFirst);
		System.out.println(firstData + secondData * 10 + thirdData * 100);
		
		s.close();
		
	}

}