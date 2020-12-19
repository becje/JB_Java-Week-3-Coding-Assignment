package CodingSteps;

public class Q5_nameLengthsCount {

	public static void main(String[] args) {
		
		String[] nameLengths = new String[6];		
		nameLengths[0] = "Sam";
		nameLengths[1] = "Tommy";
		nameLengths[2] = "Tim";
		nameLengths[3] = "Sally";
		nameLengths[4] = "Buck";
		nameLengths[5] = "Bob";
	
		for (int i = 0; i < nameLengths.length; i++) {
			String letters = new String(nameLengths[i]);
			System.out.println(nameLengths[i] + " " + letters.length());
		}

	}

}
