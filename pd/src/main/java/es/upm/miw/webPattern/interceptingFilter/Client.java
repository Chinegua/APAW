package es.upm.miw.webPattern.interceptingFilter;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(Request request, Response response) {
        filterManager.filterRequest(request, response);
    }
}
