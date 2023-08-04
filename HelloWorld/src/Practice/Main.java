package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("South");
		Wall wall3 = new Wall("East");
		Wall wall4 = new Wall("West");
		
		Ceiling ceiling = new Ceiling(120,160);
		Bed bed = new Bed("modern",4,3,2,1);
		Lamp lamp = new Lamp("Classic",false,75);
		
		bedRoom bedroom = new bedRoom("Esmaeil",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		bedroom.makeBed().Make();
		bedroom.getLamp().turnOn();
	}

}
