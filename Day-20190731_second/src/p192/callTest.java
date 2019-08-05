package p192;

public class callTest {

	public static void main(String[] args) {
		call call = new call();
		
		try {
			call.callee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
