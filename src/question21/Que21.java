/**
 * 
 */
package question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que21  implements Serializable {

	/**
	 * @param args
	 */
	private String name;
    private int age;
    private double price;

   public Que21(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}


	public static void main(String[] args) throws Exception {
		Que21 a = new Que21("Jack", 2, 2000.0);

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Que21.que"));
        out.writeObject(a);
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Que21.que"));
        Que21 a2 = (Que21) in.readObject();
        in.close();

        System.out.println("Name: " + a2.name);
        System.out.println("Age: " + a2.age);
        System.out.println("Salary: " + a2.price);
    }

}