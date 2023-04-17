/**
 * 
 */
package question20;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		Thread tr = new Thread(new MyRunnable());
		System.out.println("t state: " + t.getState()); 
		System.out.println("tr state: " + tr.getState()); 
		t.start();
		tr.start();
		System.out.println("t state: " + t.getState()); 
		System.out.println("tr state: " + tr.getState()); 
		Thread.yield();
		System.out.println("t state: " + t.getState()); 
		System.out.println("tr state: " + tr.getState()); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t state: " + t.getState()); 
		System.out.println("tr state: " + tr.getState()); 
		t.interrupt();
		try {
			t.join();
			tr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t state: " + t.getState()); 
		System.out.println("tr state: " + tr.getState());
	}

}
class MyRunnable implements Runnable {
@Override
public void run() {
	synchronized (this) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread error");
		}
	}
}
}