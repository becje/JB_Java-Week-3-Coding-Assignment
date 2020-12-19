package CodingSteps;

public class Q9_sumArray {

	public static void main(String[] args) {
		
		int[] ranNum = new int[10];
		ranNum[0] = 6;
		ranNum[1] = 12;
		ranNum[2] = 15;
		ranNum[3] = 18;
		ranNum[4] = 2;
		ranNum[5] = 37;
		ranNum[6] = 8;
		ranNum[7] = 61;
		ranNum[8] = 16;
		ranNum[9] = 40;
		
		int ranNumTotal = sumArray(ranNum);
		boolean greater100 = (ranNumTotal > 100);
		System.out.println("The total of the Array is greater than 100: " + greater100);
		
	}
	public static int sumArray(int[] numbers ) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
