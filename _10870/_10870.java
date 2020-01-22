package _10870;

import java.util.Scanner;

public class _10870 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fibo[] = new int[n + 1];
		
		for(int i = 0; i < n + 1; i++) {
			if(i == 0 || i == 1) {
				fibo[i] = i;
			} else {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
		}
		
		System.out.println(fibo[n]);
		
		s.close();
		
	}

}
