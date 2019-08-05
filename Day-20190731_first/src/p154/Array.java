package p154;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Array {

	public static void main(String[] args) {
		List<String> List = Arrays.asList("Haeun", "Shin", "Shion");
		Stream<String> stream = List.stream();
		stream.forEach(System.out::println);
	}

}
