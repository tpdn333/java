package p13.textbook.s130301;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setKind(new Tv());
		p1.setModel("스마트Tv");
		Tv tv = p1.getKind();
		String tvModel = p1.getModel();

		Product<Car, String> p2 = new Product<Car, String>();
		p2.setKind(new Car());
		p2.setModel("디젤");
		Car car = p2.getKind();
		String carModel = p2.getModel();

	}
}

class Tv {

}

class Car {

}
