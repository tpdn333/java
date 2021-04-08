package p06.lecture.p4method;

public class MyClass8 {
	int max(int ... a) {
		int max = Integer.MIN_VALUE;
		if(a.length == 0) {
			return 0;
		}
		for(int i = 0 ; i < a.length; i++) {
			if( max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
