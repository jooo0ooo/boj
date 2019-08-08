package _1193;

import java.util.Scanner;

public class _1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int roomNumber = s.nextInt();
		int times = 1;
		
		while(!((times * (times - 1) / 2 < roomNumber) && (roomNumber <= times * (times + 1) / 2))) {
			times++;
		}
		
		int middle = roomNumber - times * (times - 1) / 2;
		
		if(times % 2 == 0) {
			System.out.println(middle + "/" + (times - middle + 1));
		} else {
			System.out.println((times - middle + 1) + "/" + middle);
		}
		
	}

}
