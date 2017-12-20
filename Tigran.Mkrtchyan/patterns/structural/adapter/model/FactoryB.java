package model;

import java.util.List;

/**
 * @author Tigran.Mkrtchyan
 * @since 12/20/2017.
 */
public class FactoryB {

    public void start(List<RowMaterialFactoryB> rowMaterials) {
        System.out.println("row is starting...");
        rowMaterials.forEach(RowMaterialFactoryB::createProductB);
    }
}
