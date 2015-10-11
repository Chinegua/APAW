package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class AuthenticationFilter extends Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("Authenticating pre-process...");
        if ("/public".equals(request.getPath())) {
            // si esta autorizado se continua con la cadena de filtros
            filterChain.doFilter(request, response);
        }
        response.addHeaderParam("auth", "AuthenticationFilter");
        System.out.println("Authenticating post-process...");
    }
}
