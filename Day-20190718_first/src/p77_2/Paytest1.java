package p77_2;

public class Paytest1 {
		
	static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("1234-1234-1234", 4700);	
			
			 System.out.println("ī���ȣ"+obj.cardNo);
			 System.out.println("�����:" +amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		 Account obj = new CheckingAccount(
				 "111-111-1111",
				 "ȫ�浿",
				 10000,
				 "1234-1234-1234"
				 );
		 
		 pay((CheckingAccount) obj);

	}

}
