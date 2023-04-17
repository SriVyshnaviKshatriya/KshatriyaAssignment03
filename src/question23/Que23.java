/**
 * 
 */
package question23;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass("Hello", 10);
		System.out.println("Original object: " + obj);

		// Create multiple threads to access the object concurrently
		Thread td1 = new Thread(new MyRunnable(obj));
		Thread td2 = new Thread(new MyRunnable(obj));
		td1.start();
		td2.start();
	}

	static class MyRunnable implements Runnable {
		private final ImmutableClass obj;

		MyRunnable(ImmutableClass obj) {
			this.obj = obj;
		}

		public void run() {
			System.out.println("Thread " + Thread.currentThread().getId() + " accessed : " + obj);
			System.out.println("Thread " + Thread.currentThread().getId() + "  modify ...");
			obj.setValue(20); // Try to modify the immutable object
			System.out.println("Thread " + Thread.currentThread().getId() + " finished ...");
		}
	}
}

final class ImmutableClass {
	private final String str;
	private final int value;

	public ImmutableClass(String str, int value) {
		this.str = str;
		this.value = value;
	}

	public String getStr() {
		return str;
	}

	public int getValue() {
		return value;
	}

	public ImmutableClass setValue(int newValue) {
		// Note: This method returns a new instance of the class with the updated value
		return new ImmutableClass(str, newValue);
	}

	public String toString() {
		return "str = " + str + ", value = " + value;
	}
}