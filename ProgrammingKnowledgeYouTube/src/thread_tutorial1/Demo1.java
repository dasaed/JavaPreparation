package thread_tutorial1;
/*
There are 2 ways to create our own Thread object
	1. Subclassing the *Thread* class and instantiating a new object of that class
	2. Implementing the *Runnable* interface
	* In either case, the run() method should be implemented

*/
class MyClass1 extends Thread {

	public void run() { //run method, and it is mandatory
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


public class Demo1{

	public static void main(String[] args) {
		MyClass1 myClass = new MyClass1();
		myClass.start(); //Why use start instead of run??
		//use start to create a thread. Use run to execute like a normal program
		MyClass1 myClass1 = new MyClass1();
		myClass1.start();
	}

}
