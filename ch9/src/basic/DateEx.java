package basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Date : "+date);
		
		
		
		
		
		
		//1.8에서 추가된 클래스
		//날짜와 시간을 빼거나 더하는 메소드들이 추가됨
		
		LocalDate curDate = LocalDate.now();
		System.out.println("LocalDate : "+curDate);
		
		LocalTime curTime = LocalTime.now();
		System.out.println("LocalTime : "+curTime);
		
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : "+currDateTime);
		System.out.println("LocalDateTime plusYears  "+currDateTime.plusYears(1));
		System.out.println("LocalDateTime minusMinutes  "+currDateTime.minusMinutes(5));
		
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		
		
		
	}

}
