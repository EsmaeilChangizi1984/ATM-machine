package Inner_Class;

//***NESTED STATIC CLASS EXAMPLE***//

public class Animal {
	
	class reptile{
		public void massage() {
			System.out.println("This is reptile non-static class.");
		}
		
	}
	
	static class mamal{
		public void massage() {
			System.out.println("This is mamal static class.");
		}
		
	}
	
	
	
	public static void main(String[]args) {
		Animal animal = new Animal();
		
		Animal.reptile Reptile = animal.new reptile();
		Reptile.massage();
		
		
		Animal.mamal Mamal = new Animal.mamal();
		Mamal.massage();
		
	}

	

}
