package kr.co.student;

public class CoustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer("�浿","ȫ",23);
		cus.Address="������";
		cus.Description="����";

		String CusFirstName=cus.FirstName;
		String CusLastName=cus.LastName;
		int CusAge=cus.Age;
		String CusAddress=cus.Address;
		String CusDescription=cus.Description;
		
		System.out.println("CusLastName"+ CusLastName);
		System.out.println("CusFirstName"+ CusFirstName);
		System.out.println("CusAge"+ CusAge);
		System.out.println("CusAddress"+ CusAddress);
		System.out.println("CusDescription"+ CusDescription);
	}

}
