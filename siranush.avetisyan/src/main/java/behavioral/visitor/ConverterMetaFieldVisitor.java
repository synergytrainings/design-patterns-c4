package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.visitable.BigDecimalMetaField;
import designPatterns.behavioral.visitor.visitable.BooleanMetaField;
import designPatterns.behavioral.visitor.visitable.DateMetaField;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 11/6/2017
 */
public class ConverterMetaFieldVisitor implements MetaFieldVisitor {

    private Map<String, Object> data;

    public ConverterMetaFieldVisitor() {
        this.data = new HashMap<>();
    }

    @Override
    public void visit(BigDecimalMetaField metaField) {
        System.out.print(metaField.getMetaField() + " field value is: " + metaField.getValue() + "\n");
        this.data.put(metaField.getMetaField(), metaField.getValue());
    }

    @Override
    public void visit(BooleanMetaField metaField) {
        System.out.print(metaField.getMetaField() + " field value is: " + metaField.getValue() + "\n");
        this.data.put(metaField.getMetaField(), metaField.getValue());
    }

    @Override
    public void visit(DateMetaField metaField) {
        System.out.print(metaField.getMetaField() + " field value is: " + metaField.getValue() + "\n");
        this.data.put(metaField.getMetaField(), ((LocalDate) metaField.getValue()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
