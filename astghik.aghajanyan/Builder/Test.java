package builder;

/**
 * Created by astghik.aghajanyan on 12/4/2017.
 */
public class Test {
    public static void main(String[] args) {

        HttpWebRequest httpWebRequest = new HttpWebRequestBuilder("http://google.ru/", "GET").buildPort(80).buildScheme("http").build();
        System.out.println(httpWebRequest);
    }
}
