package _10822;

import java.util.Scanner;

public class _10822 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String l = s.nextLine();
		
		String data[] = l.split(",");
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += Integer.parseInt(data[i]);
		}
		
		System.out.println(sum);
		
		s.close();
		
	}

}
