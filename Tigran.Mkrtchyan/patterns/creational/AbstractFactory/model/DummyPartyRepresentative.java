package model;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public class DummyPartyRepresentative extends AbstractPartyRepresentative {
    @Override
    public void savePartyRepresentative() {
        System.out.println("save Dummy Party Representative");
    }
}
