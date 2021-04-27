package p15.lecture.sample;

import java.util.*;

public class Ex04List {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("java", 100));
		list.add(new Student("spring", 200));
		list.add(new Student("servlet", 150));
		list.add(new Student("jsp", 70));
		list.add(new Student("html", 90));
		list.add(new Student("css", 170));
		System.out.println(list.get(2));

		Student max = maxScore(list);
		System.out.println(max.getName() + " : " + max.getScore());

	}

	private static Student maxScore(List<Student> list) {
		Student s = null;
		int max = Integer.MIN_VALUE;

		for (Student stu : list) {
			if (stu.getScore() > max) {
				max = stu.getScore();
				s = stu;
			}
		}
		return s;
	}

}

class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}