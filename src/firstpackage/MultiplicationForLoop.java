package firstpackage;

import java.util.Scanner;

public class MultiplicationForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int a;
		System.out.println("Please enter a number ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(" " + i * a);
		}
	}
}
