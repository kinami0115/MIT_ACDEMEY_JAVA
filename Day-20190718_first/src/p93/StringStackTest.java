package p93;

public class StringStackTest {

	public static void main(String[] args) {
		StringStack strStack = new StringStack();
		
		String strElement=strStack.pop();
		strStack.push("È«±æµ¿");
		strStack.push("±è±â³²");
		strStack.push("È«±æµ¿ÀÌ");
		
		strElement=strStack.pop();
		
		if(strElement != null) {
			System.out.println(strElement);
		}
	}

}
