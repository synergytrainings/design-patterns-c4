package designPatterns.structural.adapter.example1;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class ClassifierImpl implements Classifier {

    private Integer id;
    private String name;

    public ClassifierImpl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
