package p301;

public class CallbyReferencesSample {

	
	public static void main(String[] args) {
		EntityTest entity = new EntityTest();
		entity.value=1;
		callByReference(entity);
		System.out.println("ȣ���� : "+ entity.value);

	}

	private static void callByReference(EntityTest entity) {
		entity.value++;
		System.out.println("������ :"+ entity.value);
		
	}

}
