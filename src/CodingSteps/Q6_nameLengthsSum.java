package CodingSteps;

public class Q6_nameLengthsSum {

	public static void main(String[] args) {
		String[] nameLengths = new String[6];		
		nameLengths[0] = "Sam";
		nameLengths[1] = "Tommy";
		nameLengths[2] = "Tim";
		nameLengths[3] = "Sally";
		nameLengths[4] = "Buck";
		nameLengths[5] = "Bob";
	
		int sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i].length();
		}	
		System.out.println("Sum of letters in array is: " + sum);
	}
}
