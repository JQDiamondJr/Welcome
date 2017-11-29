package firstpackage;

import java.util.Scanner;

public class NumberToDays {

	public static void main(String[] args) {
		int n;
		System.out.println("Choose a number 1 - 7 ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Your number does not correspond to a day of the week");
			break;

		}

	}

}
