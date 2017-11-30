package firstpackage;

public class OddEvenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 0; a <= 10; a++) {
			if (a == 0) {
				System.out.println(a + " is Neither Odd nor Even");
			} else if (a % 2 == 0) {
				System.out.println(a + " is Even");
			} else {
				System.out.println(a + " is Odd");
			}
		}
	}
}
