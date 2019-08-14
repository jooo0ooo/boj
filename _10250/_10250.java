package _10250;

import java.util.Scanner;

public class _10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testCaseNum = s.nextInt();
		
		int [] floors = new int[testCaseNum];
		int [] roomNumPerFloor = new int[testCaseNum];
		int [] customerNumber = new int[testCaseNum];
		
		
		for(int i = 0; i < testCaseNum; i++) {
			floors[i] = s.nextInt();
			roomNumPerFloor[i] = s.nextInt();
			customerNumber[i] = s.nextInt();
		}
		
		for(int i = 0; i < testCaseNum; i++) {
			int quotient = customerNumber[i] / floors[i];
			int remainder = customerNumber[i] % floors[i];
			int etc = 1;
			
			if(customerNumber[i] % floors[i] == 0) {
				etc = 0;
				remainder = floors[i];
			}
			
			System.out.println(remainder * 100 + quotient + etc);
		}
		
	}

}
