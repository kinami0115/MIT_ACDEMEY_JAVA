package p77_2;

public class Paytest2 {

	public static void main(String[] args) {
		 Account obj1 = new CheckingAccount(
				 "111-111-1111",
				 "ȫ�浿",
				 10000,
				 "1234-1234-1234"
				 );
		 CheckingAccount obj2 =(CheckingAccount)obj1;
		 
		 
		 if(obj2 instanceof CheckingAccount) {
			 try {
				 int amount=obj2.pay("1234-1234-1234", 4700);
				 System.out.println("ī���ȣ"+obj2.cardNo);
				 System.out.println("�����:" +amount);
				 }catch(Exception e) {
					 System.out.println(e.getMessage());
			 }
		 }else {
			 System.out.println("ĳ��Ʈ�� �� ���� Ÿ���Դϴ�.");
		 }
	

	}

}
