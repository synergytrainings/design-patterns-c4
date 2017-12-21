package designPatterns.structural.adapter.example1;

import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 12/18/2017
 */
public class ClassifierConverter {

    private final List<Classifier> items;

    public ClassifierConverter(List<Classifier> items) {
        this.items = items;
    }

    public String getAsString(Classifier selectItem) {
        return selectItem.getName();
    }

    public Classifier getAsObject(String classifierId) {
        for (Classifier selectItem : items) {
            if(selectItem.getId().equals(Integer.valueOf(classifierId))){
                return selectItem;
            }
        }
        return null;
    }
}
