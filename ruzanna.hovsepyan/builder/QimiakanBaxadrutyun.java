
/**
 * Created by ruzanna.hovsepyan on 4/23/2017.
 */
public class QimiakanBaxadrutyun {

    private  final int  servizingSize;
    private final int fat;
    //voch partadir
    private final int carbohydrate;
    private final int colories;
    private final int sodium;
    private final int salt;

    public QimiakanBaxadrutyun(int servizingSize, int fat, int carbohydrate, int colories, int sodium, int salt) {
        this.servizingSize = servizingSize;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.colories = colories;
        this.sodium = sodium;
        this.salt = salt;
    }

    QimiakanBaxadrutyun(QimiakanBaxadrityunBuilder baxadrityunBuilder){
       this.servizingSize=baxadrityunBuilder.getServizingSize();
       this.fat=baxadrityunBuilder.getFat();
       this.carbohydrate=baxadrityunBuilder.getCarbohydrate();
       this.colories=baxadrityunBuilder.getColories();
       this.sodium=baxadrityunBuilder.getSodium();
       this.salt=baxadrityunBuilder.getSalt();

    }


    /*public QimiakanBaxadrutyun(int servizingSize, int fat) {
        this(servizingSize,fat,0);
    }

    public QimiakanBaxadrutyun(int servizingSize, int fat, int carbohydrate) {
        this(servizingSize,fat,carbohydrate,0);
    }

    public QimiakanBaxadrutyun(int servizingSize, int fat, int carbohydrate, int colories) {
        this(servizingSize,fat,carbohydrate,colories,0);
    }

    public QimiakanBaxadrutyun(int servizingSize, int fat, int carbohydrate, int colories, int sodium) {
        this(servizingSize,fat,carbohydrate,colories,sodium,0);
    }

    public QimiakanBaxadrutyun(int servizingSize, int fat, int carbohydrate, int colories, int sodium, int salt) {
        this.servizingSize = servizingSize;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.colories = colories;
        this.sodium = sodium;
        this.salt = salt;
    }*/

    @Override
    public String toString() {
        return "QimiakanBaxadrutyun{" +
                "servizingSize=" + servizingSize +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                ", colories=" + colories +
                ", sodium=" + sodium +
                ", salt=" + salt +
                '}';
    }
}
