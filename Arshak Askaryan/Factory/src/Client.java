import impl.TableComponentFactory;
import util.TableComponentType;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class Client {
    public static void main(String[] args) {

        TableComponentFactory.getTableComponent(TableComponentType.DATA_TABLE).render();
        TableComponentFactory.getTableComponent(TableComponentType.SIMPLE_TABLE).render();
        TableComponentFactory.getTableComponent(TableComponentType.EDITABLE_TABLE).render();
    }
}
