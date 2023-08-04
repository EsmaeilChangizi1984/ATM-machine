package Abstract;

public abstract class Bird extends Animal implements Canfly{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking.");
		
	}

	@Override
	public void breath() {
		System.out.println("This is breathing.");
		
	}
   @Override
	public void fly() {
		System.out.println(getName()+" is flapping its wings.");
		
	}
	
	
	
	
	

}
