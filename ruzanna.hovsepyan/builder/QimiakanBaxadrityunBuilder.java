
/**
 * Created by  ruzanna.hovsepyan on 4/23/2017.
 */
public class QimiakanBaxadrityunBuilder {
    private final int servizingSize;
    private final int fat;
    private int carbohydrate = 0;
    private int colories = 0;
    private int sodium = 0;
    private int salt = 0;



    public QimiakanBaxadrityunBuilder(int servizingSize, int fat) {
        this.servizingSize = servizingSize;
        this.fat = fat;
    }

    public QimiakanBaxadrityunBuilder buildCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }

    public QimiakanBaxadrityunBuilder buildColories(int colories) {
        this.colories = colories;
        return this;
    }

    public QimiakanBaxadrityunBuilder buildSodium(int sodium) {
        this.sodium = sodium;
        return this;
    }

    public QimiakanBaxadrityunBuilder buildSalt(int salt) {
        this.salt = salt;
        return this;
    }

    public int getServizingSize() {
        return servizingSize;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public int getColories() {
        return colories;
    }

    public int getSodium() {
        return sodium;
    }

    public int getSalt() {
        return salt;
    }

    public QimiakanBaxadrutyun build(){
        return new QimiakanBaxadrutyun(this);
    }
}
