package p15.textbook;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m1 = (Member) obj;
			return m1.name.equals(name) && (m1.age == age);
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;

	}
}
