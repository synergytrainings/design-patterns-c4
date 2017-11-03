package visitor.improved;


public abstract class CarPart {
	String type;

	void acceptCarPartVisitor(CarPartVisitor visitor) {
		visitor.visit(this);
	}
}
