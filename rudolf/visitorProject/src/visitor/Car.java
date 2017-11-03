package visitor;

import java.util.ArrayList;
import java.util.List;

class Car {

	private List<CarPart> carParts = new ArrayList<>();

	List<CarPart> getCarParts() {
		return carParts;
	}

	void render() {
		for (CarPart carPart : carParts) {
			carPart.render();
		}
	}

	void upgrade() {
		for (CarPart carPart : carParts) {
			carPart.upgrade();
		}
	}

	void print() {
		for (CarPart carPart : carParts) {
			carPart.print();
		}
	}

}
