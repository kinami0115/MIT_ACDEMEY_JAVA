package p304;

public class MutableTest1 {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("this is ");
		System.out.println("조작하기전:" +text);
		text.append("an apple");
		System.out.println("조작한 후:" +text);

	}

}
