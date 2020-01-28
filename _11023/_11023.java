package _11023;

import java.util.Scanner;

public class _11023 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String nums = s.nextLine();
		
		String num[] = nums.split(" ");
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += Integer.parseInt(num[i]);
		}
		
		System.out.println(sum);
		
		s.close();
		
	}

}
