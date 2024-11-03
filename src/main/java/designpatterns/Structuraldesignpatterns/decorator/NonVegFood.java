package designpatterns.Structuraldesignpatterns.decorator;

public class NonVegFood  extends FoodDecorator{

	public NonVegFood(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prepareFood() {
		
		return super.prepareFood()+" with added chhicken";
	}

	@Override
	public double foodPrice() {
		
		return super.foodPrice()+500;
	}

}
