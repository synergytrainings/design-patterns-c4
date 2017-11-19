package Client;

import factory.CocaColaFactory;
import factory.FantaFactory;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(new CocaColaFactory());
        System.out.println(client);
        client = new Client(new FantaFactory());
        System.out.println(client);
    }
}
