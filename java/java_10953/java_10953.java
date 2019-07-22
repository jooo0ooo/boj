package java.java_10953;

import java.util.Scanner;

public class java_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		for(int i = 0; i < size; i++) {
			String getData = s.nextLine();
			String data[] = getData.split(",");
			System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
		}
		
	}

}
