package CodingSteps;

public class Q10_averageOfDoubleArray {
	
	public static void main(String[] args) {
		
		double[] age = new double[8];
		age[0] = 3.5;
		age[1] = 9.2;
		age[2] = 23.6;
		age[3] = 64.8;
		age[4] = 2.4;
		age[5] = 8.5;
		age[6] = 28.3;
		age[7] = 93.1;
		
		System.out.println(calculateAverage(age));
	}
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

}
