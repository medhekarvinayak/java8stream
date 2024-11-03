package designpatterns.Structuraldesignpatterns.decorator;

public class DecoratorPatternCustomer {

	
	public static void main(String[] args) {
		NonVegFood nv= new NonVegFood(new VegFood());
		System.out.println(nv.prepareFood());;
		System.out.println(nv.foodPrice());
		
	}
}
