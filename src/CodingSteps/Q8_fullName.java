package CodingSteps;

public class Q8_fullName {

	public static void main(String[] args) {
		
		String firstName = "Jeff";
		String lastName = "Beck";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);

	}
	
	public static String createFullName (String x, String y) {
		return x + " " + y;
	}

}
