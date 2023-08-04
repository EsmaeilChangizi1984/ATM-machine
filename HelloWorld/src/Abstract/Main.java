package Abstract;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Rex");
		dog.breath();
		dog.eat();
		
		Parrot parrot= new Parrot("Bluejay");
		parrot.breath();
		parrot.eat();
		parrot.fly();
		
		Penguin penguin= new Penguin("Canadian");
		penguin.fly();
	}

}
