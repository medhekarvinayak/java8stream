package designpatterns.behavioraldesignpatterns.memento;

public class Originator {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Momento saveState() {
		return new Momento(name);
	}

	public void getStateFromMomento(Momento momento) {
		name = momento.getName();
	}

}
