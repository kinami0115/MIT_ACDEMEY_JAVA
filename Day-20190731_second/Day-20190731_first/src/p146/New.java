/*
 * Java8 새 코딩 방식
 */
package p146;

import java.util.Arrays;
import java.util.List;

public class New {

	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;
		
		count=names.stream().filter(name->name.contains("a")).count();
		
		System.out.println("Count :"+count); 
	}

}
