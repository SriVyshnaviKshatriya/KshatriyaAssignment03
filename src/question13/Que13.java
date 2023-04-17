/**
 * 
 */
package question13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que13 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	       
	        List<String> list = new Vector<>();
	        list.add("cat");
	        list.add("dog");
	        list.add("pig");
	       
	        List<String> list1 = new ArrayList<>();
	        list1.add("penguin");
	        list1.add("peacock");
	        list1.add("Lion");
	        
	        for (String animals : list) {
	            System.out.println(animals);
	        }
	        
	        for (String animals : list1) {
	            System.out.println(animals);
	        }
	    }
	}