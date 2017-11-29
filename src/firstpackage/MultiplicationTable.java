package firstpackage;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i = 1, a;
		System.out.println("Please enter a number ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		while (i <= 10) {
			System.out.println(" " + i * a);
			i++;
		}
	}

}
