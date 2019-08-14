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
		long n = 0;
		
		for(int i = 0; i < testCaseNum; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}
		
		for(int i = 0; i < testCaseNum; i++) {
			long middle = y[i] - x[i];
			
			switch((int) middle) {
			case 1:
				middle = 1;
				break;
			case 2:
				middle = 2;
				break;
			case 0:
				middle = 0;
				break;
			}
						
			for(n = 0; middle > 2 && !(middle - 1 > n * (n + 1) / 2 && (n + 1) * (n + 2) / 2 >= middle - 1); n++) {
				
			}
			
			result[i] = n + 2;
			if(middle <= 2) {
				System.out.println(middle);
			} else {
				System.out.println(result[i]);
			}
			
		}
		
	}

}
