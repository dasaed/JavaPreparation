package thread_tutorial1;

public class Demo4p2 {
	private static int count = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread ( new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}
		
		}); //end of Thread t1 = new Thread ( new Runnable() {
		Thread t2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}
		
		}); //end of Thread t2 = new Thread ( new Runnable() {
		
		// the .start() will not wait for the other processes to finish. 
		t1.start();
		t2.start();
		
		System.out.println("Value before the join: "+ count);

		try {
			t1.join(); // Makes the program wait for the object to finish the start procees. 
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Value after the join: "+ count);
		System.out.println("The expected value of count should be 20000, but if you run"
				+ "\n"
				+"this program multiple times, that's not always the case");
		System.out.println("In this program, both threads are trying to access the count variable");
		System.out.println("But they can't access it simmultaneously, so at any given moment, only");
		System.out.println("one of the threads actually gets to update the variable.");
	} 

}
