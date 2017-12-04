import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruzanna.hovsepyan on 4/24/2017.
 */
public class Test {
    public static void main(String[] args) {

        QimiakanBaxadrutyun qimiakanBaxadrutyun =new QimiakanBaxadrityunBuilder(1,2).
                buildCarbohydrate(3).buildColories(6).buildCarbohydrate(4).build();



        QimiakanBaxadrutyun qimiakanBaxadrutyun1 =
                new QimiakanBaxadrutyun(0, 0, 2, 4, 0, 0);


        System.out.println(qimiakanBaxadrutyun);
    }
}
