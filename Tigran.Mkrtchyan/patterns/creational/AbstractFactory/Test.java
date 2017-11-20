import factory.AbstractFactory;

import java.io.IOException;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        AbstractFactory factory = AbstractFactory.getPartyFactory(AbstractFactory.PartyType.DUMMY);
        factory.createParty().saveParty();
        factory.createPartyRepresentative().savePartyRepresentative();


        factory = AbstractFactory.getPartyFactory(AbstractFactory.PartyType.REAL);
        factory.createParty().saveParty();
        factory.createPartyRepresentative().savePartyRepresentative();
    }
}
