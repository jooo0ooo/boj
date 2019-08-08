package _2292;

import java.util.Scanner;

public class _2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int roomNumber = s.nextInt();
		int times = 1;
		
		while(!((3 * times * (times - 1) < (roomNumber - 1)) && ((roomNumber - 1) <= 3 * (times + 1) * times)) && roomNumber != 1) {
			times++;
		}
		
		if(roomNumber == 1) {
			System.out.println(1);
		} else {
			System.out.println(times + 1);
		}
		
	}
	
}
