package firstpackage;

public class BreakVsContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			if (i == 4) {
				break;
			}
			System.out.print(i + "\t");
		}
		System.out.println("...");
		for (int i = 0;i < 10; i++) 
		{
			if (i == 4) 
			{		continue;
			}
		System.out.print(i + "\t");
		}
    }
}