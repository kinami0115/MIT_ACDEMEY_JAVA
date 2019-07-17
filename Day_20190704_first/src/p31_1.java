import java.util.Scanner;

/*
 *  작성일 : 2019-07-04
 *  작성자 : 김기남
 *  요약 : 자바에서 명령어 방식으로 입력 처리하는 방법
 */
//args 와 Scanner 의 차이 1. 입력받을 준비가 되어있거나 안 되어있는 차이점.
public class p31_1 {

	public static void main(String[] args) {
		  //1. args를 이용하는 방법
//		String str1=args[0];
//		String str2=args[1];
//		
//		System.out.println("str1 ="+str1);
//		System.out.println("str2 ="+str2);
		
		//2. Scanner
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		
//		System.out.println("Scanner str ="+ str);
		
		//3. args를 효과적으로 이용하는 방법
		System.out.println("값을 입력해주세요"+args[0]);
		
	}

}
