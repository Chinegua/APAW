package es.upm.miw.webPattern.frontController;

import es.upm.miw.http.HttpMethod;
import es.upm.miw.http.HttpStatus;
import es.upm.miw.http.HttpRequest;
import es.upm.miw.http.HttpResponse;

public class Server {

    public HttpResponse send(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        if (HttpMethod.GET.equals(request.getMethod())) {
            new FrontController().doGet(request, response);
        } else if (HttpMethod.POST.equals(request.getMethod())) {
            new FrontController().doPost(request, response);
        }
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
