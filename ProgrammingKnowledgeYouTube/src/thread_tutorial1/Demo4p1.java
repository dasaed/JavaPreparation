package thread_tutorial1;

public class Demo4p1 {
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
		System.out.println("Value of count: "+ count);
		System.out.println("The count value should be 20000, but it never gets to 20000");
		System.out.println("Java will not wait for the  start() function to finish before ");
		System.out.println("continuing with its normal execution. ");
	}

}
