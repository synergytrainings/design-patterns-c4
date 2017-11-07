package java.visitor.example2;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class Coffee extends Building{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Coffee is accepting visitor.");
        visitor.visit(this);
    }
    private String menu;
    private Integer countOfTables;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Integer getCountOfTables() {
        return countOfTables;
    }

    public void setCountOfTables(Integer countOfTables) {
        this.countOfTables = countOfTables;
    }
}
