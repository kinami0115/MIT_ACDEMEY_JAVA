package test2;

public class Test1_2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<1001; i++) {
			if(i%2 ==1)
			sum += i;
		}
		System.out.println(sum);
	}
}
