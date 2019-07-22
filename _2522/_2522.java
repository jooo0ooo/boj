package _2522;

import java.util.Scanner;

public class _2522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		for(int i = 0; i < size; i++) {
			for(int j = (size - (i + 1)); j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = size - 1; i > 0; i--) {
			for(int j = (size - i); j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		s.close();
	}

}
