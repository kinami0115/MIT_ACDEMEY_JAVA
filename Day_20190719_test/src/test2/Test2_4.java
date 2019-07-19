package test2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		String str;
		int num;
		System.out.println("글자입력:");
		str=scanner.next();
		System.out.println("숫자입력:");
		num=scanner.nextInt();
		System.out.println(str + num);
		scanner.close();
	}

}
