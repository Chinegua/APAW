package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.http.HttpData;
import es.upm.miw.http.HttpResponse;

public class Target {
    public void execute(HttpData request, HttpResponse response) {
        System.out.println("---------> Executing TARGET...");
    }
}
