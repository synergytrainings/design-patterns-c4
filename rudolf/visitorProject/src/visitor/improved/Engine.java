package visitor.improved;


public class Engine extends CarPart {

	Engine(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine{" +
				"type='" + type + '\'' +
				'}';
	}
}
