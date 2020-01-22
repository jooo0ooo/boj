package _11816;

import java.util.Scanner;

public class _11816 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		if(input.startsWith("0")) {
			
			if(input.startsWith("0x")) {
				System.out.println(Integer.parseInt(input.substring(2), 16));	
			} else {
				System.out.println(Integer.parseInt(input.substring(1), 8));
			}
			
		} else {
			System.out.println(input);
		}
		
		s.close();
		
	}

}
