package p77_2;

public class Paytest1 {
		
	static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("1234-1234-1234", 4700);	
			
			 System.out.println("카드번호"+obj.cardNo);
			 System.out.println("인출액:" +amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		 Account obj = new CheckingAccount(
				 "111-111-1111",
				 "홍길동",
				 10000,
				 "1234-1234-1234"
				 );
		 
		 pay((CheckingAccount) obj);

	}

}
