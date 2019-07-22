package java.java_10952;

import java.util.Scanner;

public class java_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		while(true) {
			String getData = s.nextLine();
			String data[] = getData.split(" ");
			if(data[0].equals("0") && data[1].equals("0")) {
				break;
			}
			System.out.println(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
		}
		
	}

}