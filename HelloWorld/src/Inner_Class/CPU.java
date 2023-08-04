package Inner_Class;

public class CPU {
	
	double price;
	
	
	class Processor{
		double core;
		String manufacturer;
		
		double getCatch() {
			return 4.5;
		}
		
		//accessing outer class members
		double Price() {
			return CPU.this.price;
		}
	}
	
	
    protected class RAM{
    	double memory;
    	String manufacturer;
    	
    	double getSpeed() {
    		return 7.68;
    	}
    }
}

