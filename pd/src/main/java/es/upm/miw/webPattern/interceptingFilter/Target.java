package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.webPattern.Http;
import es.upm.miw.webPattern.Response;

public class Target {
    public void execute(Http request, Response response) {
        System.out.println("---------> Executing TARGET...");
    }
}
