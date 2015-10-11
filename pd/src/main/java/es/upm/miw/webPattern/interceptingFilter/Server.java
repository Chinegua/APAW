package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.http.HttpStatus;
import es.upm.miw.http.HttpRequest;
import es.upm.miw.http.HttpResponse;

public class Server {

    public HttpResponse send(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        new FilterManager().doFilter(request, response);
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
