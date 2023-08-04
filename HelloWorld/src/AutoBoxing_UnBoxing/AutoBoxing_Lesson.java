package AutoBoxing_UnBoxing;

import java.util.ArrayList;

class IntClass {
	private int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}

}

public class AutoBoxing_Lesson {

	public static void main(String[] args) {

		ArrayList<String> myString = new ArrayList<String>();
		// ArrayList<int> myInt = new ArrayList<int>();

		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(22));

		// Auto Boxing and UnBoxing
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			intArrayList.add(Integer.valueOf(i));
		}
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " -> " + intArrayList.get(i).intValue());
		}

		Integer myIntValue = Integer.valueOf(34); // 58;
		int myInt = myIntValue.intValue();

		ArrayList<Double> doubleArrayList = new ArrayList<Double>();
		for (double db = 0.0; db <= 5; db += .5) {
			doubleArrayList.add(Double.valueOf(db));
		}

		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " -> " + doubleArrayList.get(i).doubleValue());
		}

	}

}
