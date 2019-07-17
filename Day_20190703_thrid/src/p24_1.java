
public class p24_1 {

	public static void main(String[] args) {
		int num = 0x12345678;
		int lower =  num & 0x0000ffff;
		System.out.printf("lower = %x", lower);

	}

}
