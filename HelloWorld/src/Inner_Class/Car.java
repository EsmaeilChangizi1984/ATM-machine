package Inner_Class;

   class Car {
	   
	   public void displayInfo() {
		   System.out.println("This is the car class.");
	   }

   }
   
   
   class Anonymous{
	   
	   public void createClass() {
		   
		   Car myCar = new Car() {
			   public void displayInfo() {
				   System.out.println("This is Anonymous class.");
			   }			   		   
		   };
		   
		   myCar.displayInfo();
	   }
   }
   
   class Main{
	   
	   public static void main(String[]args) {
		   Anonymous anonymous = new Anonymous();
		   anonymous.createClass();
	   }
   }
