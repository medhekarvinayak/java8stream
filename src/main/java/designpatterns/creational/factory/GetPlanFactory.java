package designpatterns.creational.factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {

		if (planType == null) {
			return null;
		} else if (planType.equalsIgnoreCase("domestic")) {

			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("commercial")) {
			return new CommercialPlan();

		} else if (planType.equalsIgnoreCase("institutional")) {
			return new InstitutionalPlan();
		} else {
			return null;
		}
	}
}
