package Java_Generic;

public class Main {

	public static void main(String[] args) {
		
		GenericClass<Integer> IntObj = new GenericClass<>(5);
		System.out.println("Integer class returns : "+ IntObj.getData());
		
		GenericClass<String> StringObj = new GenericClass<>("String Data");
		System.out.println("String class returns : "+StringObj.getData());
		
		IntObj.genericMethod(3.5);
		StringObj.genericMethod(4);
		
		//Generic_Extend<Integer> obj = new Generic_Extend<>();


	}

}
