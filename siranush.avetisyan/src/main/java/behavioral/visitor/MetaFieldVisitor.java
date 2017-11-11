package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.visitable.BigDecimalMetaField;
import designPatterns.behavioral.visitor.visitable.BooleanMetaField;
import designPatterns.behavioral.visitor.visitable.DateMetaField;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public interface MetaFieldVisitor {

    void visit(BigDecimalMetaField metaField);

    void visit(BooleanMetaField metaField);

    void visit(DateMetaField metaField);
}
