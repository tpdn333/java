package p15.textbook.exercises.ex08;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "홍길동"));

		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student s1 = iter.next();
			System.out.println(s1.studentNum + ": " + s1.name);
		}
	}
}
