package designpatterns.creational.factory;

public abstract class  Plan {
	
	double rate;
	abstract void getRate();
	
	 void calculateBill(int units) {
		System.out.println("bill is "+units*rate);
	}

}
