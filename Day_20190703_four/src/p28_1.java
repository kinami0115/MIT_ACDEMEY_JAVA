import java.time.LocalDateTime;
import java.time.Month;

public class p28_1 {

	public static void main(String[] args) {
		Month  month = LocalDateTime.now().getMonth();
		
		switch (month) {
			case MARCH:  
			case APRIL:
			case MAY:
				System.out.println( month + "�� ���̴�.");
				break;
			case JUNE:
			case JULY:
			case AUGUST:
				System.out.println( month + "�� �����̴�.");
				break;
			case SEPTEMBER:
			case OCTOBER:
			case NOVEMBER:
				System.out.println( month + "�� �����̴�.");
				break;
			default:
				System.out.println(month + "�� �ܿ��̴�.");
				break;
		}
	}

}
