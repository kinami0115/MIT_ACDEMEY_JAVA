package test4;

public class test_1 {

	public static void main(String[] args) {
		// 다음처럼 사용되는 클래스 count를 만드시오.
		//클래스명 Count 
		//필드명 count: Integer (초기괎 0)
		//메소드
		
		//add():void -count 1증가
		//sub():void -count 1감소
		
		Count count = new Count();
		Count count2 = new Count();
		System.out.println(count.count+ "   "  + count2.count);
		count.add();
		count2.add();
		System.out.println(count.count+ "   "  + count2.count);
		count.sub();
		count2.sub();
		System.out.println(count.count+ "   "  + count2.count);
	}
	

}
