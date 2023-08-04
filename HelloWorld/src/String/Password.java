package String;

public class Password {

	public static void main(String[] args) {
	
		String org = "Hauellauo wauorld  Hauow auaraue yauoauu";
		String search = "au";
		String result;
		int i;

		do {	
			i = org.indexOf(search);
			if (i != -1) {
				result = org.substring(0, i);
				result = result + org.substring(i +2); //search.length());
				org = result;
			}
		} while (i != -1);
		System.out.println(org);

	}

}
