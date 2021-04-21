package p06.lecture.paannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 실행할 때까지 유지하는거
public @interface MyAnnotation1 {
	// annotation : 메타 데이터 ( 부가 정보 )
}
