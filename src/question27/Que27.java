/**
 * 
 */
package question27;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que27 {

	/**
	 * @param args
	 */
	private static Que27 instance;

	private Que27() {}

	public static synchronized Que27 getInstance() {
		if (instance == null) {
			System.out.println("instance of SingletonSyncDemo");
			instance = new Que27();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hii, java!");
	}

	public static void main(String[] args) {
		System.out.println("instance of SingletonSyncDemo");
		Que27 ob1 = Que27.getInstance();

		System.out.println("instance of SingletonSyncDemo again");
		Que27 ob2 = Que27.getInstance();

		System.out.println("instances equal? " + (ob1 == ob2));

		System.out.println("showMessage method on object1");
		ob1.showMessage();

		System.out.println("showMessage method on object2");
		ob2.showMessage();
	}

	}