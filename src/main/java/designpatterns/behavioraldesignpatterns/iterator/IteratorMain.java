package designpatterns.behavioraldesignpatterns.iterator;

public class IteratorMain {

	public static void main(String[] args) {
		CollectionofNames cn= new CollectionofNames();
		
		Iterator ic=cn.getIterator();
		while(ic.hasNext()) {
			System.out.println(ic.next());
		}
	}
}
