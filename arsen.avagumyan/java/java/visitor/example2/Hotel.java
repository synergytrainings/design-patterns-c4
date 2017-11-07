package java.visitor.example2;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class Hotel extends Building{
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Hotel is accepting visitor.");
        visitor.visit(this);
    }
    private Integer numberOfStar;
    private Integer roomsCount;

    public Integer getNumberOfStar() {
        return numberOfStar;
    }

    public void setNumberOfStar(Integer numberOfStar) {
        this.numberOfStar = numberOfStar;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }
}
