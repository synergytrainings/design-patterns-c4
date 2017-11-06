/**
 * Created by ruzanna.hovsepyan on 11/2/2017.
 */
public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting  class after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test");
    }
}
