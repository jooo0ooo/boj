package _10699;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class _10699 {

	public static void main(String[] args) {

		Date time = Calendar.getInstance().getTime(); 
		SimpleDateFormat outputFmt = new SimpleDateFormat("yyyy-MM-dd"); 
		outputFmt.setTimeZone(TimeZone.getTimeZone("UTC"));  
		
		System.out.println(outputFmt.format(time));
	
	}

}