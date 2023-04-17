/**
 * 
 */
package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que14 {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("cat");
		l1.add("dog");
		l1.add("pig");
		l1.add("peacock");
		List<String> l2 = Collections.synchronizedList(l1);
		synchronized (l2) {
			System.out.println("Synchronised list: " + l2.size());
		}
		synchronized (l2) {
			l2.add("Anju");
			l2.add("Cherry");
		}
		synchronized (l2) {
			System.out.println("Synchronized list : " + l2);
		}
	}

}