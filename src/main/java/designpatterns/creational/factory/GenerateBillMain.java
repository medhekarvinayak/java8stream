package designpatterns.creational.factory;

import java.util.Scanner;

public class GenerateBillMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plan type:");
		String plantype=sc.nextLine();
		System.out.println("Enter units:");
		int units=sc.nextInt();
		GetPlanFactory plan = new GetPlanFactory();
		Plan myplan=plan.getPlan(plantype);
		myplan.getRate();
		myplan.calculateBill(units);
	}
}
