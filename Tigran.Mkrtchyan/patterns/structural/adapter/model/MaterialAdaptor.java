package model;

/**
 * @author Tigran.Mkrtchyan
 * @since 12/20/2017.
 */
public class MaterialAdaptor implements RowMaterialFactoryB{
    MaterialForAFactory materialForAFactory;

    public MaterialAdaptor(MaterialForAFactory materialForAFactory) {
        this.materialForAFactory = materialForAFactory;
    }

    public void createProductB() {
        materialForAFactory.createProductA();
    }

}
