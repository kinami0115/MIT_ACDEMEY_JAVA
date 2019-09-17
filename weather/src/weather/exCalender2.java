package weather;

import java.util.Calendar;
import java.util.Date;

public class exCalender2 {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.getTime());
		}

}
