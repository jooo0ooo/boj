package _10867;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class _10867 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		ArrayList<Integer> original  = new ArrayList<>();
		
		
		for(int i = 0; i < size; i++) {
			original.add(s.nextInt());
		}
		
		for(Integer a : new TreeSet<Integer> (original)) {
			System.out.print(a + " ");
		}
		
		s.close();
		
	}

}
