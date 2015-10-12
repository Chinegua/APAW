package es.upm.miw.webPattern.interceptingFilter;

import es.upm.miw.http.HttpBase;
import es.upm.miw.http.HttpResponse;

public class Target {
    public void execute(HttpBase request, HttpResponse response) {
        System.out.println("---------> Executing TARGET...");
    }
}
