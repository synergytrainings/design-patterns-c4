/**
 * Created by ruzanna.hovsepyan on 11/2/2017.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project =new Project();

        Developer junior= new JuniorDeveloper();
        Developer senior=new SeniorDeveloper();

        System.out.println("Junior start");
        project.beWritten(junior);

        System.out.println("------------------------------------");

        project.beWritten(senior);

    }
}
