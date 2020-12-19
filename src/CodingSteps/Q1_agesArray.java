package CodingSteps;

public class Q1_agesArray {

	public static void main(String[] args) {

		int[] age = new int[9];
		age[0] = 3;
		age[1] = 9;
		age[2] = 23;
		age[3] = 64;
		age[4] = 2;
		age[5] = 8;
		age[6] = 28;
		age[7] = 93;
		age[8] = 52;
		
		int sum = age[0] - age[age.length-1];
		System.out.println("Value of first number minus last number: " + sum);
		
		System.out.println();
		System.out.println("Average age: " + calculateAverage(age));
	}
	
	public static int calculateAverage(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
}