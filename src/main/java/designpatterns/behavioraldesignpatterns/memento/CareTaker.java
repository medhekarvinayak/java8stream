package designpatterns.behavioraldesignpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Momento> states = new ArrayList<>();

	public void add(Momento m) {
		states.add(m);
	}

	public Momento get(int index) {
		return states.get(index);
	}
}
