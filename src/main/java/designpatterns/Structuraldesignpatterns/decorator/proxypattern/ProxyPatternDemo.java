package designpatterns.Structuraldesignpatterns.decorator.proxypattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk
        image1.display();
        
        // Image will not be loaded from disk, as it's already loaded
        image1.display();
        
        // Image will be loaded from disk
        image2.display();
	}
}
