package threads;

public class EvenAndOddPrintUsing2threads implements Runnable {

	static int count = 1;
	Object obj;

	public EvenAndOddPrintUsing2threads(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {

		while (count <= 10) {

			if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {

				synchronized (obj) {
					System.out.println("Thread name " + Thread.currentThread().getName() + " value " + count);
					count++;
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

			if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (obj) {
					System.out.println("Thread name " + Thread.currentThread().getName() + " value " + count);
					count++;
					obj.notify();
				}
			}

		}
	}

	public static void main(String[] args) {

		Object lock= new Object();
		
		Thread t1= new Thread(new EvenAndOddPrintUsing2threads(lock), "even");
		Thread t2= new Thread(new EvenAndOddPrintUsing2threads(lock), "odd");
		t1.start();
		t2.start();
		
		
		
		
		
	}

}
