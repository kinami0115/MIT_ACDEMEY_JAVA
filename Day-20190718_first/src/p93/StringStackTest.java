package p93;

public class StringStackTest {

	public static void main(String[] args) {
		StringStack strStack = new StringStack();
		
		String strElement=strStack.pop();
		strStack.push("ȫ�浿");
		strStack.push("��Ⳳ");
		strStack.push("ȫ�浿��");
		
		strElement=strStack.pop();
		
		if(strElement != null) {
			System.out.println(strElement);
		}
	}

}
