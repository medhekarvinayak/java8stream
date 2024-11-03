package designpatterns.creational.builder.example1;

public class Person {
	
	private  String firstName;
    private  String lastName;
    private  int age;
    private  String address;
    @Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}

	public static Builder builder() {
		return new Builder();
	}
    
    private Person(Builder builder) {
    	this.firstName=builder.firstName;
    	this.lastName=builder.lastName;
    	this.age=builder.age;
    	this.address=builder.address;
    }

    public static class Builder{
    	
    	private  String firstName;
        private  String lastName;
        private  int age;
        private  String address;
        public Builder setFirstName(String firstName) {
        	this.firstName=firstName;
        	return this;
        }
        public Builder setLastName(String lastName) {
        	this.lastName=lastName;
        	return this;
        }
        public Builder setAge(int age) {
        	this.age=age;
        	return this;
        }
        public Builder setAddress(String address) {
        	this.address=address;
        	return this;
        }
        public Person build() {
        	return new Person(this);
        }
    	
    }
}
