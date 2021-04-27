package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// add 추가
		list.add("java");
		list.add("spring");
		list.add("avd");

		// size : 크기
		int len = list.size();
		System.out.println(len);

		// get : 꺼내기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
