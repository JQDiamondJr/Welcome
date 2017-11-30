package firstpackage;

public class ReturnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
		System.out.println("Before the return.");
		if (t)
			return;// return to caller
		System.out.println("This won't execute.");
	}
}
