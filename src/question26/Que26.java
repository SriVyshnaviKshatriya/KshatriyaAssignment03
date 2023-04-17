/**
 * 
 */
package question26;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que26 {

	/**
	 * @param args
	 */
	private static final Que26 instance = new Que26();

	private Que26() {
		System.out.println("Creating a Politician instance.");
	}

	public static Que26 getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("This is a Politician object.");
	}

	public static void main(String[] args) {
		Que26 o1 = Que26.getInstance();
		Que26 o2 = Que26.getInstance();

		System.out.println("object1 hash code: " + o1.hashCode());
		System.out.println("object2 hash code: " + o2.hashCode());

		o1.showMessage();
	}

}