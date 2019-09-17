package API;
import java.time.*;
public class exDateandTime {

	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);
//		
//		System.out.println(LocalDateTime.now());
//		System.out.println(LocalDateTime.of(2019, Month.JANUARY, 1, 1,23,45));
//		System.out.println(LocalDateTime.of(2029, 1,1,1,23,45,678_000_000));
		
//		System.out.println(LocalDateTime.parse("2019-01-01T01:23:45.678"));
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.plusMonths(3));

	}

}
