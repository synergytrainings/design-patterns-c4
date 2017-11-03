package visitor.improved;


public class Wheel extends CarPart {

	Wheel(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Wheel{" +
				"type='" + type + '\'' +
				'}';
	}
}
