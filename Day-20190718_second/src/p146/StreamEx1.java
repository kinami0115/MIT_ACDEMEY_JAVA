package p146;

import java.util.ArrayList;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
			List<Student> students = new ArrayList<>();
			students.add(new Student("kinam1", 100));
			students.add(new Student("kinam2", 85));
			students.add(new Student("kinam3", 95));
			
			students.stream()
			.filter(s ->s.getScore() >= 90)
			.forEach(s->System.out.println(s.getName()));
	}

}
