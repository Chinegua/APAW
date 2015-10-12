package es.upm.miw.webArchitecture.presentation.frontController;

import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void doGet(HttpRequest request, HttpResponse response) {
        dispatcher.get(request, response);
    }
    
    public void doPost(HttpRequest request, HttpResponse response) {
        dispatcher.post(request, response);
    }

}
