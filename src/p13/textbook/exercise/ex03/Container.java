package p13.textbook.exercise.ex03;

public class Container<T1, T2> {
	private T1 field1;
	private T2 field2;
	
	public T1 getKey() {
		return field1;
	}

	public void set(T1 field1, T2 field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	public T2 getValue() {
		return field2;
	}
}