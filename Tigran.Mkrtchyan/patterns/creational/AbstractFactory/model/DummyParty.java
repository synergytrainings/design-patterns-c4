package model;

/**
 * @author Tigran.Mkrtchyan
 * @since 11/20/2017.
 */
public class DummyParty extends AbstractParty {
    @Override
    public void saveParty() {
        System.out.println("save Dummy Party");
    }
}
