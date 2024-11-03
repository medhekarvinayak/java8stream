package designpatterns.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private String state;

	public void removeObservers(Observer observer) {
		 observers.remove(observer);
	}

	public void add(Observer observer) {
		observers.add(observer);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}

	public void notifyObservers() {
		observers.stream().forEach(observer ->observer.update(state));
	}
}
