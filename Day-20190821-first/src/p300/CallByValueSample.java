package p300;

public class CallByValueSample {

	public static void main(String[] args) {
		int value=1;
		callByValue(value);
		System.out.println("호출자 : "+ value);

	}

	private static void callByValue(int value) {
		value++;
		System.out.println("수신자 :"+ value);
		
	}

}
