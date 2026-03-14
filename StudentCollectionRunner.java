package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}
public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Rama"), new Student(2, "Bhopa"));

		List<Student> studentsAL = new ArrayList<>(students);

		System.out.println(studentsAL);

		Collections.sort(studentsAL);
		System.out.println("Asc" + studentsAL);
		// Collections.sort(studentsAL, new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator" + studentsAL);

		studentsAL.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator" + studentsAL);
	}

}
