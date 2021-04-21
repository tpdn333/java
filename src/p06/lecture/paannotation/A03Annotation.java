package p06.lecture.paannotation;

import p05.textbook.Week;

public class A03Annotation {
	@MyAnnotation2(attr1 = 0, value = "java", attr2 = { 3, 4 ,5 }, 
					attr3 = { "java", "Spring" }, attr4 = Week.WEDNESDAY)
	public void method1() {

	}
}
