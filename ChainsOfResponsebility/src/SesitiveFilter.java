import web.Request;
import web.Response;

public class SesitiveFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace("njnn","") + "after SensitiveFilter request");
        filterChain.doFilter(request,response,filterChain);
        response.setResponse(response.getResponse() + "after SensitiveFilter response");
    }
}
