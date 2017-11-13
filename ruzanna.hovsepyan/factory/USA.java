/**
 * Created by ruzanna.hovsepyan on 11/13/2017.
 */
public class USA implements Currency {
    @Override
    public String getCurrency() {
        return "Dollar";
    }

    @Override
    public String getSymbol() {
        return "$";
    }
}
