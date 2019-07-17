package kr.co.imformationhidding;

public class CoustomerTest {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.setFirstName("길동");
		cus.setLastName("홍");                                         //Customer cus=new Customer("길동","홍"); //비권장
		cus.setAge(23);
		cus.setAddress("수원시");
		cus.setDescription("설명");
																												//cus.Address="수원시"; //비권장
																																	//cus.Description="설명"; //비권장

		String CusFirstName=cus.getFirstName();
		String CusLastName=cus.getLastName();
		int CusAge=cus.getAge();
		String CusAddress=cus.getAddress();
		String CusDescription=cus.getDescription();
		
		System.out.println("CusLastName"+ CusLastName);
		System.out.println("CusFirstName"+ CusFirstName);
		System.out.println("CusAge"+ CusAge);
		System.out.println("CusAddress"+ CusAddress);
		System.out.println("CusDescription"+ CusDescription);
	}

}
