package thread_tutorial1;

public class Demo4p3 {
	private static int count = 0;
	public static synchronized void inccount() {
		//The "synchronized" keyword forces any number of threads that try to access the method 
		//to access it one at a time.
		count++;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread ( new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					inccount();
				}
			}
		
		}); //end of Thread t1 = new Thread ( new Runnable() {
		Thread t2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					inccount();
				}
			}
		
		}); //end of Thread t2 = new Thread ( new Runnable() {
		
		// the .start() will not wait for the other processes to finish. 
		t1.start();
		t2.start();
		System.out.println("Value before the join: "+ count);

		try {
			t1.join(); // Makes the program wait for the object to finish the start process. 
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Value after the join: "+ count);
		System.out.println("The expected value of count is 20000"
				+"\n"
				+"And no matter how many times you run this program,"
				+"\n"
				+"You will always get 20000");
	}

}
