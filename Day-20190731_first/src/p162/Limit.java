package p162;

import java.util.ArrayList;

import java.util.List;

public class Limit {

	public static void main(String...args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("kim", 100));
		students.add(new Student("Lee", 60));
		students.add(new Student("Parik", 80));
		
		students.stream().limit(2).forEach(s-> System.out.println( s.getName()));

	}

}
