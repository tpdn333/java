package p05.lecture.enumType;

public class A01enumType {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		MyEnum e1 = MyEnum.MY_VALUE;
		MyEnum e2 = MyEnum.VALUE1;
		MyEnum e3 = MyEnum.VALUE2;

		MyEnum e4 = MyEnum.MY_VALUE;

		System.out.println(e1 == e4);
		System.out.println(e1.equals(e4));
		System.out.println(e2.toString());
		System.out.println(e3.hashCode());
	}
}

class MyClass {

}
