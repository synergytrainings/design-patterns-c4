package factory;

import model.AbstractParty;
import model.AbstractPartyRepresentative;
import model.DummyParty;
import model.DummyPartyRepresentative;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public class DummyPartyFactory extends AbstractFactory{
    @Override
    public AbstractParty createParty() {
        return new DummyParty();
    }

    @Override
    public AbstractPartyRepresentative createPartyRepresentative() {
        return new DummyPartyRepresentative();
    }
}
