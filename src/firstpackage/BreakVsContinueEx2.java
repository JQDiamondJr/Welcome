package firstpackage;

public class BreakVsContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 0; n < 7; n++) 
		{
			System.out.println("In loop:" + n);
			if (n == 2) {
				continue;
			}
			System.out.println(" Survived first guard");
			if (n == 4) {
				break;
			}
			System.out.println(" Survived second guard");
		}
		System.out.println("End of loop or exit via break");
	}

}
