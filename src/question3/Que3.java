/**
 * 
 */
package question3;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que3 extends Q3 {

	/**
	 * @param args
	 */
		@Override
	    public Que3 workMethod1() {
		 System.out.println("SubClass");
	        return new Que3();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que3 s  = new Que3();
		Q3 a =  s.workMethod1();
		System.out.println(a.getClass());

	}
	}


