package p154;

import java.util.Arrays;

import java.util.stream.Stream;

public class LsitnSet {

	public static void main(String[] args) {
		String[] array = {"Haeun", "Shin", "Shion"};
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(System.out::println);
	}

}
