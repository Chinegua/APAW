package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.HttpStatus;
import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class Server {

    public Response send(Request request) {
        Response response = new Response();
        new FilterManager().doFilter(request, response);
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
