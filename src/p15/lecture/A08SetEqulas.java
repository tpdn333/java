package p15.lecture;

import java.util.HashSet;
import java.util.Set;

public class A08SetEqulas {
	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();
		Person p1 = new Person();
		p1.setName("홍길동");

		Person p2 = new Person();
		p1.setName("김자바");

		Person p3 = new Person();
		p1.setName("홍길동");

		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		Set<Integer> intSet = new HashSet<>();
		intSet.add(new Integer(3));
		intSet.add(new Integer("3"));
		
	}
}

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
