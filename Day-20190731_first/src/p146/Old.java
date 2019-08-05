/*
*기존 코딩 방식
*/
package p146;

import java.util.Arrays;
import java.util.List;

public class Old {

	

	public static void main(String[] args) {
		List<String>  names= Arrays.asList("park", "Lee", "Hwang", "kim");
		long count =0;
		
		for(String name : names) {
			if(name.contains("a")); {
				count++;
			}
		}
		System.out.println("count :" + count);
	}	
	
}
