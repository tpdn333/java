package p15.textbook.exercises.ex10;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("blue", 96));
		set.add(new Student("hong", 86));
		set.add(new Student("white", 92));
		
		Student s1 = set.last();
		System.out.println("최고점수: " + s1.score);
		System.out.println("최고점수를 받은 아이디: " + s1.id);
		
	}
}
