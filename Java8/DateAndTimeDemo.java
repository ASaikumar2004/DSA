package Java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {
	
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate tmrw=date.plusDays(1);
		System.out.println(tmrw);
		
		LocalDate nextMonth=date.plusMonths(1);
		System.out.println(nextMonth);
		
		LocalDate nextWeek=date.plusWeeks(1);
		System.out.println(nextWeek);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		
		//time
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		System.out.println("hours: "+time.getHour());
		System.out.println("Minutes : "+time.getMinute());
		
		
		//set date and time
		
		LocalDate sd=date.of(2022, 12, 12);
		System.out.println(sd);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s=sd.format(formatter);
		System.out.println(s);
		
		
		//between
		
		LocalDate bdy=LocalDate.of(2003, 06, 19);
		LocalDate tdy=LocalDate.now();
		
		Period period=Period.between(bdy, tdy);
		System.out.println(period.getYears()+"-"+period.getMonths()+"-"+period.getDays());
		
		
		//Zone
		
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone);
		
		
		ZonedDateTime usa=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(usa);
	}

}
