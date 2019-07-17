package p58;

public class NullTest {

	public static void main(String[] args) {
		String nullStr = null;
		
		if(nullStr != null) {
			System.out.println( nullStr.length());
		}else {
			System.out.println("nullStr is null");
		}

	}

}
