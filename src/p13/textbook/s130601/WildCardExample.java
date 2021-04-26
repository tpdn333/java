package p13.textbook.s130601;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> pC = new Course<>("일반인과정", 5);
		pC.add(new Person("일반인"));
		pC.add(new Person("직장인"));
		pC.add(new Student("학생"));
		pC.add(new HighStudent("고등학생"));

		Course<Worker> wC = new Course<>("직장인과정", 5);
		wC.add(new Worker("직장인"));

		Course<Student> sC = new Course<>("학생과정", 5);
		sC.add(new Student("학생"));
		sC.add(new HighStudent("고등학생"));

		Course<HighStudent> hC = new Course<>("고등학생과정", 5);
		hC.add(new HighStudent("고등학생"));

		registerCourse(pC);
		registerCourse(wC);
		registerCourse(sC);
		registerCourse(hC);
		System.out.println();
		
//		registerCourseStudent(pC);
//		registerCourseStudent(wC);
		registerCourseStudent(sC);
		registerCourseStudent(hC);
		System.out.println();
		
		registerCourseWorker(pC);
		registerCourseWorker(wC);
//		registerCourseWorker(sC);
//		registerCourseWorker(hC);
		System.out.println();
	}

}
