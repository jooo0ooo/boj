package _5543;

import java.util.Scanner;

public class _5543 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int burger1 = s.nextInt(), burger2 = s.nextInt(), burger3 = s.nextInt(),
				soda1 = s.nextInt(), soda2 = s.nextInt();
		
		int burgerMin = burger1, sodaMin = soda1;
		
		if(burgerMin > burger2) {
			burgerMin = burger2;
		}
		
		if(burgerMin > burger3) {
			burgerMin = burger3;
		}
		
		if(sodaMin > soda2) {
			sodaMin = soda2;
		}
		
		System.out.println(burgerMin + sodaMin - 50);
		
		s.close();
	}

}
