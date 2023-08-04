package Map;
import java.util.HashMap;
import java.util.Map;

public class HashMap_DataStructur {

	public static void main(String[] args) {
		
		//Map<Integer,String>student = new HashMap<>();
		HashMap<Integer,String>students = new HashMap<>();
		students.put(1, "Esmaeil");
		students.put(2, "Peter");
		students.put(3, "Robert");
		
		System.out.println("Students List :" +students);
		System.out.println("First student is : "+students.get(1));
		
		students.remove(2);
		System.out.println("Robert removed from the List");
		
		

	}

}
