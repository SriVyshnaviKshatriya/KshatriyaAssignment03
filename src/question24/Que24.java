/**
 * 
 */
package question24;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que24 {

	private String name;
	private double price;
	/**
	 * @param name
	 * @param price
	 */
	public Que24(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setprice(double price) {
		this.price = price;
	}
	protected void finalize() throws Throwable {
		// print message when object is garbage collected
		System.out.println(name + " move to garbage collection.");
	}
	
	public static void main(String args[]) {
		Que24 q = new Que24("BMW",1000.00);
		q = null;
		System.gc();
		System.out.println("finish");
			
	}
}
