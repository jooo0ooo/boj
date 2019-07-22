package _10991;

import java.util.Scanner;

public class _10991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		for(int i = 0; i < size; i++) {
			for(int j = size - (i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = i + 1; k > 0; k--) {
				System.out.print("*");
				if(k > 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		s.close();
	}

}
