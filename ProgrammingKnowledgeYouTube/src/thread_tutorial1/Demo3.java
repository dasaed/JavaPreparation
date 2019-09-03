package thread_tutorial1;

public class Demo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread ( new Runnable() {
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
		});//end of t1 Initiator
		
		t1.start();
		
	}//end of main

}//end of Demo3 Class
