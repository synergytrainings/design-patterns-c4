package visitor.improved;


import java.util.ArrayList;
import java.util.List;

class Car {

	private List<CarPart> carParts = new ArrayList<>();

	void render() {
		RenderCarPartVisitor renderer = new RenderCarPartVisitor();
		for (CarPart carPart : carParts) {
			carPart.acceptCarPartVisitor(renderer);
		}
	}

	void print() {
		PrintCarPartVisitor visitor = new PrintCarPartVisitor();
		for (CarPart carPart : carParts) {
			carPart.acceptCarPartVisitor(visitor);
		}
	}

	void upgrade() {
		UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
		for (CarPart carPart : carParts) {
			carPart.acceptCarPartVisitor(visitor);
		}
	}

	List<CarPart> getCarParts() {
		return carParts;
	}
}
