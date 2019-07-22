package _10951;

import java.util.Scanner;

public class _10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		while(s.hasNextLine()) {
			String getData = s.nextLine();
			String data[] = getData.split(" ");
			System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
		}
	}

}
