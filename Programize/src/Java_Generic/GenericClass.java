package Java_Generic;

public class GenericClass<T> {
	
	private T data;
	
	public GenericClass(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public <T> void genericMethod(T data) {
		System.out.println("Generic Method.");
		System.out.println("Data passed : "+data);
	}

}
