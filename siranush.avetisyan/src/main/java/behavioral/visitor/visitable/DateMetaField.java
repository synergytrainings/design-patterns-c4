package designPatterns.behavioral.visitor.visitable;

import designPatterns.behavioral.visitor.MetaFieldVisitor;

import java.time.LocalDate;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public class DateMetaField extends MetaFieldImpl {

    public DateMetaField(String metaField, LocalDate value) {
        super(metaField, value);
    }

    @Override
    public void accept(MetaFieldVisitor metaFieldVisitor) {
        metaFieldVisitor.visit(this);
    }

}
