package _10992;

import java.util.Scanner;

public class _10992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = size - (i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			if(i != 0) {
				for(int l = (2 * i - 1); l > 0; l--) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int m = (2 * size - 1); m > 0; m--) {
			System.out.print("*");
		}
		System.out.println();
		
		s.close();
	}

}
