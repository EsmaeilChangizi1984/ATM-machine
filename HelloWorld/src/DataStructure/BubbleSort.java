package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < (intArray.length - i); j++) {
				if (intArray[j - 1] > intArray[j]) {

					int temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;

				}
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
