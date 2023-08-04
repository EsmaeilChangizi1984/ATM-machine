package DataStructure;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		

		for (int i = 0; i < intArray.length - 1; i++) {
			int largest = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[largest]) {
					largest = j;
				}
			}
			int temp = intArray[largest];
			intArray[largest] = intArray[i];
			intArray[i] = temp;

		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
