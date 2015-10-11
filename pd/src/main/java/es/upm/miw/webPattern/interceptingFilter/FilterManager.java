package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager() {
    }

     public void doFilter(Request request, Response response) {
         //Se procesa el request y se establece el Target y los Filters
         filterChain = new FilterChain(new Target());
         filterChain.addFilter(new TimeFilter());
         filterChain.addFilter(new AuthenticationFilter());
         filterChain.addFilter(new DebugFilter());
         filterChain.doFilter(request, response);
    }
}
