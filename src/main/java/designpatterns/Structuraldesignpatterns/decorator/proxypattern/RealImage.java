package designpatterns.Structuraldesignpatterns.decorator.proxypattern;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk();
	}

	public void loadImageFromDisk() {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Diplaying "+fileName);

	}

}
