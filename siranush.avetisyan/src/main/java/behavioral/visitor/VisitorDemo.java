package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.visitable.BigDecimalMetaField;
import designPatterns.behavioral.visitor.visitable.BooleanMetaField;
import designPatterns.behavioral.visitor.visitable.DateMetaField;
import designPatterns.behavioral.visitor.visitable.MetaField;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 11/10/2017
 */
public class VisitorDemo {

    public static void main(String[] args) {
        List<MetaField> metaFields = new ArrayList<>();
        metaFields.add(new BigDecimalMetaField("Amount", BigDecimal.TEN));
        metaFields.add(new DateMetaField("DateUpdated", LocalDate.now()));
        metaFields.add(new BooleanMetaField("IsApproved", true));

        MetaFieldVisitor metaFieldVisitor = new ConverterMetaFieldVisitor();

        for (MetaField metaField : metaFields) {
            metaField.accept(metaFieldVisitor);
        }
    }
}
