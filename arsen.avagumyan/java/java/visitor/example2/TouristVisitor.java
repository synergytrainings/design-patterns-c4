package java.visitor.example2;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public class TouristVisitor implements Visitor {
    @Override
    public void visit(City city) {
        System.out.println("I'm visiting city");
        city.setTestimonials("Inch vor baner....."+city.getZipCode() + city.getName());
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the park!");
        park.setTestimonials("Inch vor baner....."+park.getName() +park.getAddress() + park.getSquare());
    }

    @Override
    public void visit(Coffee coffee) {
        System.out.println("I'm visiting the coffee!");
        coffee.setTestimonials("Inch vor baner....."+coffee.getName() + coffee.getAddress()+ coffee.getMenu());
    }

    @Override
    public void visit(Hotel hotel) {
        System.out.println("I'm visiting the hotel!");
        hotel.setTestimonials("Inch vor baner....."+hotel.getName() + hotel.getAddress()+ hotel.getRoomsCount() + hotel.getRoomsCount());
    }

}
