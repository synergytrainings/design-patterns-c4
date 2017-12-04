package builder;

/**
 * Created by astghik.aghajanyan on 12/4/2017.
 */
public class HttpWebRequest {

    private String host  ;

    private String path ;

    private String query ;

    private String scheme ;

    private int port ;

    private String method;

    HttpWebRequest(HttpWebRequestBuilder httpWebRequestBuilder) {
        this.host = httpWebRequestBuilder.getHost() ;
        this.path = httpWebRequestBuilder.getPath() ;
        this.query = httpWebRequestBuilder.getQuery() ;
        this.scheme = httpWebRequestBuilder.getScheme() ;
        this.port = httpWebRequestBuilder.getPort() ;
        this.method = httpWebRequestBuilder.getMethod() ;
    }

    @Override
    public String toString() {
        return "HttpWebRequest{" +
                "host='" + host + '\'' +
                ", path='" + path + '\'' +
                ", query='" + query + '\'' +
                ", scheme='" + scheme + '\'' +
                ", port=" + port +
                ", method='" + method + '\'' +
                '}';
    }
}
