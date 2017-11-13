/**
 * Created by ruzanna.hovsepyan on 11/13/2017.
 */
public class Test {
    public static void main(String a[]){
        Currency currency;
        try {
            currency = CurrencyFactory.getCurrencyByCountry("IN");
            System.out.println("Indian currency: "+currency.getCurrency()+"Indian currency symbol: "+currency.getSymbol());
            currency=CurrencyFactory.getCurrencyByCountry("AMD");
            System.out.println("Armenian currency: "+currency.getCurrency()+"Armenian currency symbol: "+currency.getSymbol());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
