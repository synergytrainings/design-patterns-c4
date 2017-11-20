import com.example.factory.FormationFactory;
import com.example.factory.impl.ItalyFormation;
import com.example.factory.impl.SpainFormation;

/**
 * @author rudolf.shakhgaldyan on 11/20/2017
 */
public class SquadMaker {
	private String name;

	public SquadMaker(String name) {
		this.name = name;
	}

	public void makeLineup() {
		FormationFactory formationFactory = getFormation(name);
		formationFactory.createDefense();
		formationFactory.createMidfield();
		formationFactory.createAttack();
	}

	private FormationFactory getFormation(String name) {
		switch (name) {
			case "spain": return new SpainFormation();
			default: return new ItalyFormation();
		}
	}
}
