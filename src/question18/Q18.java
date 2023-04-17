/**
 * 
 */
package question18;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Q18 extends Thread{

	/**
	 * @param args
	 */
	public void run() {
	     System.out.println("Thread in this class Started");
		}
public static void main(String args[]) {
	Q18 t = new Q18();
	t.start();
	t.start();
					
   }

}