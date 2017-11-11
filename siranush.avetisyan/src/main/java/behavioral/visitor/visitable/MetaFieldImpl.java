package designPatterns.behavioral.visitor.visitable;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public abstract class MetaFieldImpl implements MetaField {

    private final String metaField;
    private Object value;

    public MetaFieldImpl(String metaField, Object value) {
        this.metaField = metaField;
        this.value = value;
    }

    @Override
    public String getMetaField() {
        return this.metaField;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
