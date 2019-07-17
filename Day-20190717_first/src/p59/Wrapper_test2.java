package p59;

public class Wrapper_test2 {

		public static void main(String[] args) {
			//int -> Integer
			Integer num01 = new Integer(10); //x
			Integer num02 = Integer.valueOf(10); //o
			
			//Integer -> int
			int num03 = num02.intValue();
						
			//String -> Integer
			Integer num04 = new Integer("10"); //x
			Integer num05 = Integer.valueOf(10); //o
			Integer num06 = Integer.valueOf("11",2); 
			
			System.out.println(num06);
			//String -> int 가장 많이 사용하는 케이스
			int num07 = Integer.parseInt("10"); //o
			int num08 = Integer.parseInt("11", 2);
			
			//int -> Strinig
			String num09 = Integer.toString(10);//o 제일 많이 사용하는 케이스
			
			//Integer -> String
			Integer num10 = Integer.valueOf(10);
			String num11 = num10.toString();
		}
}
