package _3003;

import java.util.Scanner;

public class _3003 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int king = 1 - s.nextInt();
		int queen = 1 - s.nextInt();
		int rook = 2 - s.nextInt();
		int bishop = 2 - s.nextInt();
		int knight = 2 - s.nextInt();
		int pawn = 8 - s.nextInt();
		
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
		
	}

}