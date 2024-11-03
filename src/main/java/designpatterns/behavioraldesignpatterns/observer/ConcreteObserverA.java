package designpatterns.behavioraldesignpatterns.observer;

public class ConcreteObserverA implements Observer {

	@Override
	public void update(String message) {
		System.out.println("ConcreteObserverA : "+message);
		
	}

}
