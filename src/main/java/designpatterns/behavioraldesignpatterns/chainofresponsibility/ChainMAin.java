package designpatterns.behavioraldesignpatterns.chainofresponsibility;

public class ChainMAin {

	public static void main(String[] args) {
		
		Handler a= new ConcreteHandlerA();
		Handler b= new ConcreteHandlerB();
		a.setNext(b);
		a.handleRequest("B");
	}
}
