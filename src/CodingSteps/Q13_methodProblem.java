package CodingSteps;

import java.util.Arrays;

public class Q13_methodProblem {

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
	
		Arrays.sort(ranNum);
		System.out.println(Arrays.toString(ranNum));
		
		/*
		 * Sorts the above int array from lowest number to highest number and returns numbers to Console
		 * Created this because it was the answer to one of my research question homework assignments
		 * Effecient way of sorting an array if required to.
		 */
	}
}
