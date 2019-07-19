package test2;

public class test2_3 {

	public static void main(String[] args) {
		int x=10 , y =3;
		System.out.println(add(x,y));
		System.out.println(sub(x,y));
		System.out.println(mul(x,y));
		System.out.println(div(x,y));
		System.out.println(rem(x,y));
	}

	private static int rem(int x, int y) {
		// TODO Auto-generated method stub
		return x%y;
	}

	private static double div(int x, int y) {
		// TODO Auto-generated method stub
		return (double)x/y;
	}

	private static int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	private static int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	private static int add(int x, int y) {
		
		return x+y;
	}

}
