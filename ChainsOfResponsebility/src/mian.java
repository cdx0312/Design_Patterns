import web.Request;
import web.Response;

public class mian {
    public static void main(String[] args) {
        String msg = "hello world :), <script> njnn";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponse("response");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());
        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new FaceFilter());
        filterChain.addFilter(filterChain1);

        filterChain.doFilter(request,response, filterChain);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponse());
    }
}
