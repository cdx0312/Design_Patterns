import web.Request;
import web.Response;

public class FaceFilter implements Filter{


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace(":)","^V^") + "after faceFilter request");
        filterChain.doFilter(request,response,filterChain);
        response.setResponse(response.getResponse() + "after faceFilter response");
    }
}
