package visitor.improved;


public class Light extends CarPart {

	Light(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Light{" +
				"type='" + type + '\'' +
				'}';
	}
}
