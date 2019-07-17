
public class PersonMain {

	public static void main(String[] args) {
			Person p1=new Person("홍길동",30,"경기도 수원시 권선구");
			p1.Fphone="010-0000-0000";
			
			String Pname=p1.Fname;
			int Page=p1.Fage;
			String Paddress=p1.Faddress;
			String Pphone=p1.Fphone;
			
//			System.out.println(p1.Fphone);
			System.out.println(Pname);
			System.out.println(Page);
			System.out.println(Paddress);
			System.out.println(Pphone);
			
	}

}
