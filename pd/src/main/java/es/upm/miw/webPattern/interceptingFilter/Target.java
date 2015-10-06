package es.upm.miw.webPattern.interceptingFilter;

public class Target {
    public void execute(Request request, Response response) {
        System.out.println("Executing TARGET:" + request + ", " + response);
    }
}
