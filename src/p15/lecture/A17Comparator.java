package p15.lecture;

import java.util.Comparator;
import java.util.TreeSet;

public class A17Comparator {
	public static void main(String[] args) {
		TreeSet<Dog> set = new TreeSet<>(new DogComparator());
		set.add(new Dog(22));
		set.add(new Dog(32));
		set.add(new Dog(26));
		set.add(new Dog(42));
		
		System.out.println(set);
		
		
	}
}

class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// o1이 o2보다 크면 양수, 작으면 음수 같으면 0
//		if (o1.id > o2.id)
//			return 1;
//		else if (o1.id < o2.id)
//			return -1;
//		else if (o1.id == o2.id)
//			return 0;
//		return 0;
//		
		return o1.id - o2.id;
	}

}

class Dog {
	public int id;

	public Dog(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + "]";
	}

}
