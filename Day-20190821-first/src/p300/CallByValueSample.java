package p300;

public class CallByValueSample {

	public static void main(String[] args) {
		int value=1;
		callByValue(value);
		System.out.println("ȣ���� : "+ value);

	}

	private static void callByValue(int value) {
		value++;
		System.out.println("������ :"+ value);
		
	}

}
