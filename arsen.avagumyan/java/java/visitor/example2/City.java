package java.visitor.example2;

import java.util.ArrayList;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class City extends Element {
    ArrayList<Element> places = new ArrayList<Element>();
    public City() {
        places.add(new Park());
        places.add(new Coffee());
        places.add(new Hotel());
    }
    private String zipCode;

    @Override
    public void accept(Visitor visitor) {
        System.out.println("City is accepting visitor.");
        visitor.visit(this);
        for (Element e : places) {
            e.accept(visitor);
        }
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
