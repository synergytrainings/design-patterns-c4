package java.visitor.example2;

import java.math.BigDecimal;

/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class Park extends Building {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting visitor.");
        visitor.visit(this);
    }
    private BigDecimal square;

    public BigDecimal getSquare() {
        return square;
    }

    public void setSquare(BigDecimal square) {
        this.square = square;
    }
}
