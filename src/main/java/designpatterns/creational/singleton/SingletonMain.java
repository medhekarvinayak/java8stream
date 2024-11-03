package designpatterns.creational.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingleClass sc =SingleClass.getSingleClass();
		sc.setName("vinayak");
		System.out.println(sc.getName());
		SingleClass sc2 =SingleClass.getSingleClass();
		System.out.println(sc2.getName());
	}
}
