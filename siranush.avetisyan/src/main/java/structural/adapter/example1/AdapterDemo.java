package designPatterns.structural.adapter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class AdapterDemo {

    public static void main(String[] args) {
        User user = new User(1, "Adam", "Copper");
        Classifier userClassifier = new UserClassifier(user);
        Classifier someSector = new ClassifierImpl(2, "Science");

        List<Classifier> classifierList = new ArrayList<>();
        classifierList.add(userClassifier);
        classifierList.add(someSector);

        ClassifierConverter converter = new ClassifierConverter(classifierList);

        System.out.print(converter.getAsString(someSector) + "\n");
        System.out.print(converter.getAsObject("1").getName());
    }
}
