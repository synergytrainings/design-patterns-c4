package designPatterns.behavioral.visitor.visitable;

import designPatterns.behavioral.visitor.MetaFieldVisitor;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public class BooleanMetaField extends MetaFieldImpl {

    public BooleanMetaField(String metaField, Boolean value) {
        super(metaField, value);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
        metaFieldVisitor.visit(this);
    }
}
