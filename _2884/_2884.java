package _2884;

import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		int alarmHour, alarmMinute;
		
		if(m - 45 < 0) {
			alarmMinute = 60 + (m - 45);
			if(h - 1 < 0) {
				alarmHour = 24 - 1;
			} else {
				alarmHour = h - 1;
			}
		} else {
			alarmMinute = m - 45;
			alarmHour = h;
		}
		
		System.out.println(alarmHour + " " + alarmMinute);
		
		s.close();
		
	}

}
