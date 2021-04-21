package p06.lecture.paannotation;

import p05.textbook.Week;

public @interface MyAnnotation2 {
	String value(); // element
	int attr1();
	int[] attr2();
	String[] attr3();
	Week attr4();
	
	int attr5() default 99;		// dafault 값을 주면 명시하지 않아도 된다.
	String attr6() default "java";
}
