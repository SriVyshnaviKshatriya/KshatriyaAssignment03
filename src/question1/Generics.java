/**
 * 
 */
package question1;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Generics<G> {

	/**
	 * @param args
	 */
	
	 private G valv;

	    public G getValv() {
	        return valv;
	    }

	    public void setValue(G valv) {
	        this.valv = valv;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics<String> g = new Generics<>();
		g.setValue("Hello, World!");
		String value = g.getValv();
		System.out.println(value);

	}

}
