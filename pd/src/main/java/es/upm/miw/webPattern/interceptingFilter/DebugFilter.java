package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class DebugFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("Debuging pre-process...");
        filterChain.doFilter(request, response);
        response.getHeaderParams().put("debug", "DebugFilter");
        System.out.println("Debuging post-process...");
    }
}
