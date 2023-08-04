package Inner_Class;

//****NON STATIC NESTED CLASS (INEER CLASS) EXAMPLE****//

public class Main_CPU {

	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram =cpu.new RAM();
		
		
		System.out.println("Processor Cache : "+processor.getCatch());
		System.out.println("Speed of RAM : "+ram.getSpeed());
		System.out.println("The price of CPU : "+processor.Price());
		
		

	}

}
