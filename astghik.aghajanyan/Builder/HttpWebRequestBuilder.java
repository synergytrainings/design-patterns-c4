package builder;

/**
 * Created by astghik.aghajanyan on 12/4/2017.
 */
public class HttpWebRequestBuilder {

    //required
    private String path ;
    private String method;

    //optional
    private String host;
    private String query ;
    private String scheme ;
    private int port ;


    public HttpWebRequestBuilder(String path, String method) {
        this.path = path;
        this.method = method;
    }

    public HttpWebRequestBuilder buildHost(String host) {
        this.host = host ;
        return this;
    }

    public HttpWebRequestBuilder buildPort(Integer port) {
        this.port = port ;
        return this;
    }

    public HttpWebRequestBuilder buildPath(String path) {
        this.path = path ;
        return this;
    }

    public HttpWebRequestBuilder buildQuery(String query) {
        this.query = query ;
        return this;
    }

    public HttpWebRequestBuilder buildScheme(String scheme) {
        this.scheme = scheme ;
        return this;
    }


    public HttpWebRequest build() {
      return  new HttpWebRequest(this);
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getScheme() {
        return scheme;
    }

    public int getPort() {
        return port;
    }

    public String getMethod() {
        return method;
    }
}
