package designpatterns.behavioraldesignpatterns.observer;

public class Main {

	public static void main(String[] args) {
		Subject sub =new Subject();
		ConcreteObserverA ob1=new ConcreteObserverA();
		ConcreteObserverB ob2=new ConcreteObserverB();
		sub.add(ob1);
		sub.add(ob2);
		sub.setState("vinayak");
	}
}
