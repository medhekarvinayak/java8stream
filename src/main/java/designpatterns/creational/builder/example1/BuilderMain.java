package designpatterns.creational.builder.example1;

public class BuilderMain {

	public static void main(String[] args) {
		Person person = Person.builder().setFirstName("vinayak").setLastName("medhekar").setAge(31).setAddress("new india").build();
	System.out.println(person);
	}
}
