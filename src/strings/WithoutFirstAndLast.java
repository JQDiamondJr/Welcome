package strings;

public class WithoutFirstAndLast {

	public static void main(String[] args) {
		System.out.println(removeEndAndBegin("Welcome"));

	}
	public static String removeEndAndBegin(String str1) {
		return str1.substring(1, str1.length()-1);
	
}
}
