package firstpackage;

import java.util.Scanner;

public class SmartCalculator {

	public static void main(String[] args) {
		double a, b, z = 0;
		String operation;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = in.nextInt();
		System.out.println("Enter the second number");
		b = in.nextInt();
		System.out.println("Choose the operation +, -, * or /");
		operation = in.next();
		switch(operation) {
			case "+":
				z =(a+b);   break;
			case "-":
				z=(a-b);	break;	
			case "*":
				z=(a*b);	break;
			case "/":
				z=(a/b);	break;
				default:
					System.out.println("Invalid operation selection");
			}
		System.out.println(z);
	}

}
