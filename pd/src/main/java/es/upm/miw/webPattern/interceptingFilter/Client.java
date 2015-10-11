package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class Client {

    public Response send(Request request) {
        return new Server().send(request);
    }

}
