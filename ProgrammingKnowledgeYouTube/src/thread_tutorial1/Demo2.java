package thread_tutorial1;

class MyClass2 implements Runnable{

	
	public void run() {

		for (int i = 0; i<101; i++) {
			System.out.println(Thread.currentThread().getId()+" Value of "+i);
			//Thread.currentThread().getId() == gets the current thread ID
		}
		
		try {
			Thread.sleep(100); // pauses a running thread for 100 milliseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass2());
		Thread t2 = new Thread(new MyClass2());
		t1.start();
		t2.start();

	}

}
