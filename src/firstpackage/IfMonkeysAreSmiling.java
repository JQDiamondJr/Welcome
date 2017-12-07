package firstpackage;


public class IfMonkeysAreSmiling {
	public static void main(String[] args) {
		tellIfMonkeysAreSmiling(true,false);	
	}
  static void tellIfMonkeysAreSmiling(boolean aSmile, boolean bSmile) {
		if (aSmile == bSmile) {
			System.out.println("We are in Trouble");
		} else {
			System.out.println("We are NOT in Trouble");
		}

	}
}