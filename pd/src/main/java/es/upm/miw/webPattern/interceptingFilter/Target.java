package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.web.http.HttpBase;
import es.upm.miw.web.http.HttpResponse;

public class Target {
    public void execute(HttpBase request, HttpResponse response) {
        System.out.println("---------> Executing TARGET...");
    }
}
