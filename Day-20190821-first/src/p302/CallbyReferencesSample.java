package p302;

public class CallbyReferencesSample {

	
	public static void main(String[] args) {
		EntityTest entity = new EntityTest();
		entity.value=1;
		callByReference(entity);
		System.out.println("호출자 : "+ entity.value);

	}

	private static void callByReference(EntityTest entity) {
		entity=new EntityTest();
		entity.value=2;
		System.out.println("수신자 :"+ entity.value);
		
	}

}
