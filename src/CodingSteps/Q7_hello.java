package CodingSteps;

public class Q7_hello {

	public static void main(String[] args) {
		
		System.out.println(multiplyString("Hello", 3));		

	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

}
