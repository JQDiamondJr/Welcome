package arrayExamples;

public class CommonElementsBetweenTwoArrays {
	public static void commonBetweenArrays (String[] arr1, String[] arr2) {
	for	(int f=0; f<arr1.length;f++) {
		for (int s=0;s<arr2.length;s++) {
			if(arr1[f].equals(arr2[s])) {
			System.out.println(arr1[f]);
			}
		}
	}
	}

	public static void main(String[] args) {
		String[] array1 = {"1","6","18","14","2"};
		String[] array2 = {"2","15","7","6","12"};
		CommonElementsBetweenTwoArrays.commonBetweenArrays(array1, array2);
	}

}
