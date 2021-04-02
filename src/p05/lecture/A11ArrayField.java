package p05.lecture;

public class A11ArrayField {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];

		System.out.println(arr1.length);
		System.out.println(arr2.length);

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 10;
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 100;
		}
		
		System.out.println("arr1 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("arr2 출력");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}
}
