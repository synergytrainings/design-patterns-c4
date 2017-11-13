/**
 * Created by ruzanna.hovsepyan on 11/13/2017.
 */
public class CurrencyFactory {

    public static Currency getCurrencyByCountry(String abbrvation) throws Exception {

        if ("IN".equalsIgnoreCase(abbrvation)) {
            return new India();
        } else if ("USA".equalsIgnoreCase(abbrvation)) {
            return new USA();
        }else if("AMD".equals(abbrvation)){
            return new ArmenianDram();
        }
        throw new Exception("Invalid country...");
    }
}
