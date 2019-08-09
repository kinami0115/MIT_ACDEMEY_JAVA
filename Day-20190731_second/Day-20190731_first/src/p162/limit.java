package p162;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class limit {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student("Park",100));
		studentList.add(new Student("Lee",80));
		studentList.add(new Student("Hwang",100));
		
		System.out.println(studentList);
		
		studentList.stream()
			.limit(2)
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
	}

}









