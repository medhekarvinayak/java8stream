package designpatterns.behavioraldesignpatterns.chainofresponsibility;

public class ConcreteHandlerA  extends Handler{

	@Override
	public void handleRequest(String request) {
		if(request.equals("A")) {
			System.out.println("ConcreteHandlerA called");
		}else {
			if(next != null)
			next.handleRequest(request);
		}
		
	}

}
