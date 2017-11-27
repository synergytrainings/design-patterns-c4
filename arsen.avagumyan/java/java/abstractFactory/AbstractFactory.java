package abstractFactory;

/**
 * Created by arsen.avagumyan on 11/19/2017.
 */
abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
