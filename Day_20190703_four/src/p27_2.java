import java.time.LocalDateTime;

public class p27_2 {

	public static void main(String[] args) {
		int month = LocalDateTime.now().getMonthValue();
		
		if ( 3 <= month && month <= 5 ) {
			System.out.println( month + "월은 봄입니당");
		}  else if ( 6 <= month && month <=8) {
				System.out.println( month + "월은 여름입니당");
	    } else if  ( 9 <= month && month <=11) {
				System.out.println( month + "월은 가을입니당");
		} else {
			System.out.println( month + "월은 겨울입니당");
		}
	}
}
