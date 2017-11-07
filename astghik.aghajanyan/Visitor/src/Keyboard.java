import javax.swing.*;

/**
 * Created by astghik.aghajanyan on 11/6/2017.
 */
public class Keyboard implements ComputerPart {

    private String letter ;
    private Integer number ;

    public void copy(){
        System.out.println("Ctrl + C");
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
