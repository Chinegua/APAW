package es.upm.miw.webPattern.interceptingFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class FilterChain {
    private List<Filter> filters;

    private Target target;

    private Iterator<Filter> iterator;

    public FilterChain(Target target) {
        this.target = target;
        filters = new ArrayList<Filter>();
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
        iterator = filters.iterator();
    }

    public void doFilter(Request request, Response response) {
        if (iterator.hasNext()) {
          iterator.next().doFilter(request,response, this);
        } else {
            target.execute(request,response);
        }
    }

}
