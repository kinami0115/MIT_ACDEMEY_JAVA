package p77_2;

public class Paytest2 {

	public static void main(String[] args) {
		 Account obj1 = new CheckingAccount(
				 "111-111-1111",
				 "홍길동",
				 10000,
				 "1234-1234-1234"
				 );
		 CheckingAccount obj2 =(CheckingAccount)obj1;
		 
		 
		 if(obj2 instanceof CheckingAccount) {
			 try {
				 int amount=obj2.pay("1234-1234-1234", 4700);
				 System.out.println("카드번호"+obj2.cardNo);
				 System.out.println("인출액:" +amount);
				 }catch(Exception e) {
					 System.out.println(e.getMessage());
			 }
		 }else {
			 System.out.println("캐스트할 수 없는 타입입니다.");
		 }
	

	}

}
