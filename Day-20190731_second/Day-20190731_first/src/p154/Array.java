package p154;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Array {

	public static void main(String[] args) {
		String[] array= {"Park","Lee","Hwang","Kim"};
		Stream<String> stream=Arrays.stream(array);
		stream.forEach(System.out::println);
	}

}
