package _2753;

import java.util.Scanner;

public class _2753 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		int result = 0;
		
		if(year % 4 == 0) {
			
			if(year % 100 != 0) {
				
				result = 1;
				
			} else {
				
				if(year % 400 == 0) {
				
					result = 1;
				
				}
				
			}
		}
		
		System.out.println(result);
	
	}

}