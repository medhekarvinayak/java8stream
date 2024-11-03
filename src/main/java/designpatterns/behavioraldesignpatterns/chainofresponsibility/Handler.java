package designpatterns.behavioraldesignpatterns.chainofresponsibility;

public abstract class Handler {

	protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
