/**
 * Created by ruzanna.hovsepyan on 11/2/2017.
 */
public class ProjectClass implements  ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
