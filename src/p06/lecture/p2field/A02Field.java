package p06.lecture.p2field;

public class A02Field {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "sonata";
		car1.model = "hybird";
		
		System.out.println(car1.name);
		System.out.println(car1.model);
		
		Car car2 = new Car();
		car2.name = "tesla";
		car2.model = "model_X";
		
		System.out.println(car2.name);
		System.out.println(car2.model);
	}
}
