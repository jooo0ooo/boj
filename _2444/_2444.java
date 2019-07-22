package _2444;

import java.util.Scanner;

public class _2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		for(int i = 0; i < size; i++) {
			
			for(int k = 0; k < size - i - 1; k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int l = size - 1; l > 0; l--) {
			
			for(int m = 0; m < size - l; m++) {
				System.out.print(" ");
			}
			
			for(int n = 0; n < l * 2 - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}