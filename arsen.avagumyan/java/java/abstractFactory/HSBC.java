package abstractFactory;

/**
 * Created by arsen.avagumyan on 11/19/2017.
 */
public class HSBC implements Bank{
    private final String BNAME;
    private final  String bancingUrl = "bancing.com";
    HSBC(){
        BNAME="HSBC BANK";
    }
    public String getBankName() {
        return BNAME;
    }

    public String getBancingUrl() {
        return bancingUrl;
    }
}
