package abstractFactory;

/**
 * Created by arsen.avagumyan on 11/19/2017.
 */
public class ABB implements Bank {
    private final String BNAME;
    public ABB(){
        BNAME="ABB BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
