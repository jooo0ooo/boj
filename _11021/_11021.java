package _11021;

import java.util.Scanner;

public class _11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		for(int i = 0; i < size; i++) {
			String getData = s.nextLine();
			String data[] = getData.split(" ");
			System.out.println("Case #" + (i + 1) + ": " + (Integer.parseInt(data[0]) + Integer.parseInt(data[1])));
		}
		
		s.close();
		
	}

}
