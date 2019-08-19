package _1011;

import java.util.Scanner;

public class _1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int testCaseNum = s.nextInt();
		
		long [] x = new long[testCaseNum];
		long [] y = new long[testCaseNum];
		long [] result = new long[testCaseNum];
		
		for(int i = 0; i < testCaseNum; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}
		
		for(int i = 0; i < testCaseNum; i++) {
			
			long distance = y[i] - x[i];
			
			if(distance <= 0) {
				System.out.println(0);
				return;
			}
			
			long n = (long) Math.floor(Math.sqrt(distance));
			
			if(Math.sqrt(distance) == n) {
				
				System.out.println(result[i] = 2 * n - 1);
				
			} else if(n * n < distance && distance <= n * n + n) {
				
				System.out.println(result[i] = 2 * n);
				
			} else if(n * n + n < distance && distance < (n + 1) * (n + 1)) {
				
				System.out.println(result[i] = 2 * n + 1);
				
			}
			
		}
		
	}

}
