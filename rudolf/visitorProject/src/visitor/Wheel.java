package visitor;


class Wheel extends CarPart {
	@Override
	void print() {
		System.out.println("Wheel");
	}

	@Override
	void render() {
		System.out.println("Render wheel");
	}

	@Override
	void upgrade() {
		System.out.println("Upgrade wheel");
	}
}