package p94;

public class GenericStackTest {

	public static void main(String[] args ) {
		GenericStack<String> genStack = new GenericStack<>();

		genStack.push("Scala");
		genStack.push("Groovy");
		genStack.push("Java");
		
		String genElement = genStack.pop();
		if(genElement != null) {
			System.out.println(genElement);
		}
			
	}

}
