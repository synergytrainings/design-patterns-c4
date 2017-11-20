package factory;

import model.AbstractParty;
import model.AbstractPartyRepresentative;
import model.Party;
import model.PartyRepresentative;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public class PartyFactory extends AbstractFactory {

    @Override
    public AbstractParty createParty() {
        return new Party();
    }

    @Override
    public AbstractPartyRepresentative createPartyRepresentative() {
        return new PartyRepresentative();
    }
}
