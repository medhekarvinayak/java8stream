package designpatterns.creational.prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"vinayak",5000);
		System.out.println(emp);
		Employee emp2 =(Employee)emp.getClone();
		System.out.println(emp2);
	}
}
