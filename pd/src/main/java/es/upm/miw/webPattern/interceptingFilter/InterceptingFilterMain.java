package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.HttpMethod;
import es.upm.miw.webPattern.Request;
import es.upm.miw.webPattern.Response;

public class InterceptingFilterMain {
    public static void main(String[] args) {
        Request request = new Request("//LocalHost", "/public", HttpMethod.GET);
        System.out.println(request.toString() + "\n");

        Response response = new Client().send(request);

        System.out.println("\n" + response);
    }
}
