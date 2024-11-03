package designpatterns.behavioraldesignpatterns.memento;

public class MementoPatternDemo {

	public static void main(String[] args) {
		Originator or=new Originator();
		
		
		CareTaker states=new CareTaker();
		or.setName("#staet1");
		states.add(or.saveState());
		or.setName("#staet2");
		states.add(or.saveState());
		
		System.out.println(or.getName());
		or.getStateFromMomento(states.get(0));
		System.out.println(or.getName());
		
	}
}
