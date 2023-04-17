/**
 * 
 */
package question2;

/**
 * @author Sri Vyshnavi Kshatriya
 *
 */
public class Que2 extends Q2 {
	  
//	@Override
//	private void workMethod1() {
//		System.out.println("workMethod1 in q A");
//	}

	void workMethod2() {
		System.out.println("workMethod2 in class B");
	}

	protected void workMethod3() {
		System.out.println("workMethod3 in class B");
	}

//	@Override
//	public void workMethod4() {
//		System.out.println("workMethod4 in class B");
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q2 s = new Que2();
		s.workMethod2();
		s.workMethod3();
		s.workMethod4();

	}

}