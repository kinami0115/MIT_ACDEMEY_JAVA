package p302;

public class CallbyReferencesSample {

	
	public static void main(String[] args) {
		EntityTest entity = new EntityTest();
		entity.value=1;
		callByReference(entity);
		System.out.println("ȣ���� : "+ entity.value);

	}

	private static void callByReference(EntityTest entity) {
		entity=new EntityTest();
		entity.value=2;
		System.out.println("������ :"+ entity.value);
		
	}

}
