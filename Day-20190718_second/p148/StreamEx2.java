package p148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
			List<Student> students = new ArrayList<>();
			students.add(new Student("kinam1", 100));
			students.add(new Student("kinam2", 85));
			students.add(new Student("kinam3", 95));
			
			System.out.println(students);
			
			Collections.sort(students, (student1, student2)-> Integer.compare(student1.getScore(), student2.getScore()));
			
			System.out.println(students);
//			students.stream()
//			.filter(s ->s.getScore() >= 90)
//			.forEach(s->System.out.println(s.getName()));
	}

}
