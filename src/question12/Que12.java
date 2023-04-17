/**
 * 
 */
package question12;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que12 {

	/**
	 * @param args
	 */
	
	public final int mul() {
		return 10*5 ;
	}
	
		public static void main(String args[]) throws Throwable {
			final double m = 5;
			Que12 q = new Que12();
			try {
			System.out.println(q.mul());
			q.finalize();
			double qu1 = m*0;
			}
			catch(Exception err){
				System.out.println(" Error "+err);
			}
			finally {
				
				System.out.println(" Executed Finally Block ");
			}
			
		}
		

}
