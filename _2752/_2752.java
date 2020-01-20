package _2752;

import java.util.Arrays;
import java.util.Scanner;

public class _2752 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			num[i] = s.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
		
		s.close();
	}

}
