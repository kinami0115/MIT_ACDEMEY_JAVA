package test2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		String str;
		int num;
		System.out.println("�����Է�:");
		str=scanner.next();
		System.out.println("�����Է�:");
		num=scanner.nextInt();
		System.out.println(str + num);
		scanner.close();
	}

}
