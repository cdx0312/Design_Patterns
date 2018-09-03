import web.Request;
import web.Response;

public interface Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain);
}
