package p62;

public class Boxing_Test {

	public static void main(String[] args) {
		//UnBoxing
		//Integer num02 = Integer.valueOf(10);
		int num = 10;
		
		Integer numInt  = 10; //x 오토박싱
		
		//Integer sum=num + numInt.intValue();
		Integer sum =num + Integer.valueOf(10); //x 언박싱 -> 연사 -> 오토박싱

	}

}
