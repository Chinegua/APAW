package es.upm.miw.webPattern.frontController;

import es.upm.miw.http.HttpRequest;
import es.upm.miw.http.HttpResponse;

public class Client {

    public HttpResponse send(HttpRequest request) {
        return new Server().send(request);
    }

}
