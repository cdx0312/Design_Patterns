public class MsgProcessor {
    private String msg;
//    private Filter[] filters = {new HTMLFilter(), new SesitiveFilter(), new FaceFilter()};
    private FilterChain filterChain;
//    public Filter[] getFilters() {
//        return filters;
//    }
//
//    public void setFilters(Filter[] filters) {
//        this.filters = filters;
//    }

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

//    public String process() {
//        String result = filterChain.doFilter(msg);
//        return result;
//    }
}
