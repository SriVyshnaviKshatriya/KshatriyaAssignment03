/**
 * 
 */
package question10;

import java.io.FileNotFoundException;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que10 extends Q10 {

	/**
	 * @param args
	 */
	public void workMethod1() throws FileNotFoundException {
		System.out.println("Question2");
        
    }
	public static void main(String args[]) {
		Que10 s = new Que10();
		try {
			s.workMethod1();
		} catch (FileNotFoundException que) {
			// TODO Auto-generated catch block
			que.printStackTrace();
		}
	}
}