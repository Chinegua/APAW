package es.upm.miw.webPattern;

public class Response extends Http {

    private HttpStatus status;

    public Response() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HTTP/1.1 " + status.getCode() + " " + status.toString() + "\n" + super.toString();
    }

}
