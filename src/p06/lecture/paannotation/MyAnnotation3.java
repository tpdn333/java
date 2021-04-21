package p06.lecture.paannotation;

public @interface MyAnnotation3 {
	// element
	int value() default 5;
	int attr1() default 10;
	int attr2() default 99;
}
