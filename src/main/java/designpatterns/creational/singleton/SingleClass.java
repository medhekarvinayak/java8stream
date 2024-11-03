package designpatterns.creational.singleton;

public final class SingleClass {

	private String name;
	private static SingleClass sc;

	private SingleClass() {

	}
	public  void setName(String vname) {
		name=vname;
	}
	public String getName() {
		return name;
	}

	public static SingleClass getSingleClass() {

		if (sc == null) {
			synchronized (SingleClass.class) {

				sc = new SingleClass();
				return sc;
				
			}

		}
		else {
			return sc;
		}
	}
}
