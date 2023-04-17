/**
 * 
 */
package question15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que15 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Hashtable<Integer, String> h1 = new Hashtable<>();
	        h1.put(1, "cat");
	        h1.put(2, "dog");
	        h1.put(3, "pig");
	        HashMap<Integer, String> h2 = new HashMap<>();
	        h2.put(1, "peacock");
	        h2.put(2, "penguin");
	        h2.put(3, "Lion");
	        System.out.println("Hashtable:");
	        for (Map.Entry<Integer, String> en : h1.entrySet()) {
	            System.out.println(en.getKey() + ": " + en.getValue());
	        }
	        System.out.println("HashMap:");
	        for (Map.Entry<Integer, String> ent : h2.entrySet()) {
	            System.out.println(ent.getKey() + ": " + ent.getValue());
	        }
	    }
	}