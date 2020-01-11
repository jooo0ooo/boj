package _16170;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class _16170 {

	public static void main(String[] args) {

		ZoneId utc = ZoneId.of("UTC");

        ZonedDateTime utcTime = ZonedDateTime.of(LocalDateTime.now(utc), utc);
        
        DateTimeFormatter timeFormat = null;
        
        timeFormat = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(utcTime.format(timeFormat));
        
        timeFormat = DateTimeFormatter.ofPattern("MM");
        System.out.println(utcTime.format(timeFormat));
        
        timeFormat = DateTimeFormatter.ofPattern("dd");
        System.out.println(utcTime.format(timeFormat));
	
	}

}