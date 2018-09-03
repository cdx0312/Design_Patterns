import web.Request;
import web.Response;

public class HTMLFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace('<','{')
                .replace('>','}') + "after HTMLFilter request");
        filterChain.doFilter(request,response,filterChain);
        response.setResponse(response.getResponse() + "after HTMLFilter response");

    }
}
