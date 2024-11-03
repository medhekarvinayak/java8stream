package designpatterns.behavioraldesignpatterns.observer;

public class ConcreteObserverB implements Observer {

	@Override
	public void update(String message) {
		System.out.println("ConcreteObserverB : "+message);
		
	}

}