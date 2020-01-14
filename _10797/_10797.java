package _10797;

import java.util.Scanner;

public class _10797 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int dayNum = s.nextInt();
		
		int[] carNum = new int[5];
		
		int violationNum = 0;
		
		for(int i = 0; i < 5; i++) {
			carNum[i] = s.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			if(carNum[i] == dayNum) {
				violationNum++;
			}
		}
		
		System.out.println(violationNum);
		
		s.close();
		
	}

}
