package p15.textbook;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();

		// 저장될때 나이순으로 저장됨
		set.add(new Person("홍길동", 45));
		set.add(new Person("김자바", 25));
		set.add(new Person("박지원", 31));

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) {
			Person p1 = iter.next();
			System.out.println(p1.name + ": " + p1.age);
		}

	}
}
