/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public class VisitorImpl implements Visitor {
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getWeight() * fruit.getPricePerKg();
        System.out.println("Cost of " + fruit.getName() + " is " + cost);
        return cost;
    }

    @Override
    public int visit(Drink drink) {
        int cost = drink.getCount() * drink.getPrice();
        System.out.println("Cost of " + drink.getName() + " is " + cost);
        return drink.getPrice();
    }

    @Override
    public int visit(Notebook notebook) {
        int cost = 0;
        if (computer.getPrice() > 400) {
            cost = (int) (computer.getPrice() * 0.9);
        } else {
            cost = computer.getPrice();
        }
        System.out.println("Cost of " + computer.getName() + " is " + cost);
        return cost;
    }
}
