package es.upm.miw.webPattern.frontController;

import es.upm.miw.http.HttpMethod;
import es.upm.miw.http.HttpRequest;

public class FrontControllerMain {

    public void helper1() {
        HttpRequest request = new HttpRequest("LocalHost", "Helper1", HttpMethod.GET);
        new Client().send(request);
    }

    public void helper1Action1(String param1) {
        HttpRequest request = new HttpRequest("LocalHost", "Helper1", HttpMethod.POST);
        request.addQueryParam("action", "action1");
        request.addQueryParam("param1", param1);
        new Client().send(request);
    }

    public void helper1Action2(String param2) {
        HttpRequest request = new HttpRequest("LocalHost", "Helper1", HttpMethod.POST);
        request.addQueryParam("action", "action2");
        request.addQueryParam("param2", param2);
        new Client().send(request);
    }

    public void helper2() {
        HttpRequest request = new HttpRequest("LocalHost", "Helper2", HttpMethod.GET);
        new Client().send(request);
    }

    public void helper2Action1(String param1) {
        HttpRequest request = new HttpRequest("LocalHost", "Helper2", HttpMethod.POST);
        request.addQueryParam("action", "action1");
        request.addQueryParam("param1", param1);
        new Client().send(request);
    }

    public void helper3() {
        HttpRequest request = new HttpRequest("LocalHost", "Helper3", HttpMethod.GET);
        new Server().send(request);
    }

    public static void main(String[] args) {
        FrontControllerMain main = new FrontControllerMain();
        System.out.println("-------  Helper1  ------------------------------------");
        main.helper1();
        System.out.println("-------  Helper1:action1  ----------------------------");
        main.helper1Action1("param");
        System.out.println("-------  Helper1:action2  ----------------------------");
        main.helper1Action2("param");
        System.out.println("-------  Helper2  ------------------------------------");
        main.helper2();
        System.out.println("-------  Helper2:action1  ----------------------------");
        main.helper2Action1("1");
        System.out.println("-------  Helper3  ------------------------------------");
        main.helper3();
        System.out.println("-------------------------------------------------------");
    }

}
