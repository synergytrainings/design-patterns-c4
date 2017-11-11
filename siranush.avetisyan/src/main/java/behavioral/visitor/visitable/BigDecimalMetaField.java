package designPatterns.behavioral.visitor.visitable;

import designPatterns.behavioral.visitor.MetaFieldVisitor;

import java.math.BigDecimal;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public class BigDecimalMetaField extends MetaFieldImpl {

    public BigDecimalMetaField(String metaField, BigDecimal value) {
        super(metaField, value);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
        metaFieldVisitor.visit(this);
    }
}
