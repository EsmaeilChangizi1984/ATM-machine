package String;

public class MyString {

	public static void main(String[] args) {
		
		String originalString = "this is java, java is fun";
		String replacedString = originalString.replaceAll("\\bis\\b", "was");

		System.out.println(replacedString);
}
}
