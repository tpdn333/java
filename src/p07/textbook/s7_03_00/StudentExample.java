package p07.textbook.s7_03_00;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name: " + s1.name);
		System.out.println("ssn: " + s1.ssn);
		System.out.println("studentNo: " + s1.studentNo);
	}
}
