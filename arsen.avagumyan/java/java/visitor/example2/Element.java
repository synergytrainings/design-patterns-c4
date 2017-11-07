package java.visitor.example2;
/**
 * Created by arsen.avagumyan on 11/05/2017.
 */
public abstract class Element {
    abstract void accept(Visitor visitor);
    private String name;
    private String testimonials;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTestimonials() {
        return testimonials;
    }

    public void setTestimonials(String testimonials) {
        this.testimonials = testimonials;
    }
}
