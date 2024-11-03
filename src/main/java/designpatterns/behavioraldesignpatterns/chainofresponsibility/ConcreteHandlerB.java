package designpatterns.behavioraldesignpatterns.chainofresponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handleRequest(String request) {
		if(request.equals("B")) {
			System.out.println("ConcreteHandlerB called");
		}else {
			if(next != null)
				next.handleRequest(request);
		}
		
	}
}
