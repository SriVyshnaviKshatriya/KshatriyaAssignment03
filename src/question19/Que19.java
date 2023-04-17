/**
 * 
 */
package question19;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que19 extends Thread{

	/**
	 * @param args
	 */
		public void run() {
			System.out.println("Created thread from extending Thread");
			}

		public static void main(String args[]) {
			Que19 q = new Que19();
			q.start();
			Q19 t = new Q19();
			Thread t1 = new Thread(t);
			t1.start();
		}
		}