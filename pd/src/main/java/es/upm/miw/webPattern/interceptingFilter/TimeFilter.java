package es.upm.miw.webPattern.interceptingFilter;

import java.util.Date;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class TimeFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        long requestTime = new Date().getTime();
        System.out.println("Time pre-process: " + new Date());
        filterChain.doFilter(request, response);
        response.getHeaderParams().put("time", "Time");
        System.out.println("Time post-process: " + (new Date().getTime() - requestTime) + "ms");
    }
}
