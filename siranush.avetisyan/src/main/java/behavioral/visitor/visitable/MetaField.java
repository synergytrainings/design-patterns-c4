package designPatterns.behavioral.visitor.visitable;

import designPatterns.behavioral.visitor.MetaFieldVisitor;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public interface MetaField {

    void accept(MetaFieldVisitor metaFieldVisitor);

    String getMetaField();

    Object getValue();

}
