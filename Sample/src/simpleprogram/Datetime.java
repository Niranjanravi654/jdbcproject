package simpleprogram;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Datetime {
	public static void main(String[]args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		}

}
