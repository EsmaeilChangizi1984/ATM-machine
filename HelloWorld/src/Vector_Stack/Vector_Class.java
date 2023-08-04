package Vector_Stack;

import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(34);
		vector.add(0, 22);
		vector.add(10);
		
		System.out.println(vector.contains(10));
		System.out.println("First Element of Vector is "+vector.firstElement());
		System.out.println("Last Index of 10 is : "+vector.lastIndexOf(10));
		
		for(int i:vector) {
			System.out.println(i);
		}

	}

}
