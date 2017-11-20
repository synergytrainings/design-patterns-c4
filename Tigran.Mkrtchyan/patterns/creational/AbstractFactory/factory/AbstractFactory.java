package factory;

import model.AbstractParty;
import model.AbstractPartyRepresentative;

import java.io.IOException;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public abstract class AbstractFactory {

    public abstract AbstractParty createParty();

    public abstract AbstractPartyRepresentative createPartyRepresentative();

    private static DummyPartyFactory DUMMY_PARTY_FACTORY;
    private static PartyFactory PARTY_FACTORY;

    public static AbstractFactory getPartyFactory(PartyType partyType) throws IOException {
        switch (partyType) {
            case DUMMY:
                if (DUMMY_PARTY_FACTORY == null) {
                    DUMMY_PARTY_FACTORY = new DummyPartyFactory();
                }
                return DUMMY_PARTY_FACTORY;
            case REAL:
                if (PARTY_FACTORY == null) {
                    PARTY_FACTORY = new PartyFactory();
                }
                return PARTY_FACTORY;
            default:
                throw new IOException("Please use enum to specify factory");
        }
    }

    public enum PartyType {
        DUMMY,
        REAL;
    }
}
