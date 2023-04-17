/**
 * 
 */
package question17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		for(Integer in : l1) {
			if (in == 3) {
				l1.remove(Integer.valueOf(in)); 
			}
		}
        System.out.println(l1);
		
	}

}