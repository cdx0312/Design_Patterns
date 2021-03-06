import web.Request;
import web.Response;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void removeFilter(Filter filter) {
        this.filters.remove(filter);
    }


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size())
            return;
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request,response,filterChain);
    }
}
