package visitor.improved;


public class Client {

	public static void main(String[] args) {
		Car car = new Car();

		car.getCarParts().add(new Wheel("left-front"));
		car.getCarParts().add(new Wheel("left-back"));
		car.getCarParts().add(new Wheel("right-front"));
		car.getCarParts().add(new Wheel("right-back"));
		car.getCarParts().add(new Light("right-light"));
		car.getCarParts().add(new Light("left-light"));
		car.getCarParts().add(new Engine("v8"));

		car.upgrade();
		car.print();
		car.render();
	}

}
