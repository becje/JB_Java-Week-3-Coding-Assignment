package CodingSteps;

public class Q2_names {

	public static void main(String[] args) {
		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Calculates the average number of letters per name
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		double avg = sum;
		System.out.println("Average number of letters per name is: " + avg / names.length);
		
		// line break and Concatenation
		System.out.println();
		System.out.println("Concating Names");
			
		//Utilizing the .concat object to concatenate names together
		String listOfNames = 
				(names[0] + " | ").concat
				(names[1] + " | ").concat
				(names[2] + " | ").concat
				(names[3] + " | ").concat
				(names[4] + " | ").concat
				(names[5]);
		
		//Calls on a Method for concatenating names together
		String listOfNames2 = names(names[0], names[1], names[2], names[3], names[4], names[5]);
		
		System.out.println(listOfNames);
		System.out.println(listOfNames2);
		
		}		
	
	public static String names(String a, String b, String c, String d, String e, String f) {
		return a + " | " + b + " | " + c + " | " + d + " | " + e + " | " + f;
		
	}

}

