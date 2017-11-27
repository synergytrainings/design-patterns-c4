package abstractFactory;

/**
 * Created by arsen.avagumyan on 11/19/2017.
 */
public class VTB implements Bank  {
    private final String BNAME;
    private final  String bancingUrl = "bancing.com";
    VTB(){
        BNAME="VTB BANK";
    }
    public String getBankName() {
        return BNAME;
    }

    public String getBancingUrl() {
        return bancingUrl;
    }
}
