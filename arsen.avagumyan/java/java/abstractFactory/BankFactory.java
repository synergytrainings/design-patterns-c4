package abstractFactory;

/**
 * Created by arsen.avagumyan on 11/19/2017.
 */
public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("ABB")){
            return new ABB();
        } else if(bank.equalsIgnoreCase("HSBC")){
            return new HSBC();
        } else if(bank.equalsIgnoreCase("VTB")){
            return new VTB();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
