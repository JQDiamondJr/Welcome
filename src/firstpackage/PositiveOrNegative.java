package firstpackage;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int x;
		System.out.println("Please enter a number?");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if(x<0) {
			System.out.println(x+" is a NEGATIVE number");
		}
		else if(x>0) {
			System.out.println(x+" is a Positive number");
		}else {
			System.out.println("0 is neither Positive nor Negative");
		}
	}

}
