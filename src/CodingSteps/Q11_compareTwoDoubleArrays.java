package CodingSteps;

public class Q11_compareTwoDoubleArrays {

	public static void main(String[] args) {
		
		double[] precipPercent = new double[7];
		precipPercent[0] = 10.5;
		precipPercent[1] = 5.2;
		precipPercent[2] = 5.6;
		precipPercent[3] = 5.8;
		precipPercent[4] = 0.4;
		precipPercent[5] = 5.5;
		precipPercent[6] = 0.3;
		
		double[] temp = new double[7];
		temp[0] = 39.8;
		temp[1] = 40.2;
		temp[2] = 37.9;
		temp[3] = 45.1;
		temp[4] = 53.6;
		temp[5] = 49.4;
		temp[6] = 38.5;
		
		if (calculateAverage(precipPercent) > calculateAverage(temp))
			System.out.println("True");
		else
			System.out.println("False");

	}
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
}
