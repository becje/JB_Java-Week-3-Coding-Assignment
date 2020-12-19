package CodingSteps;

public class Q12_willBuyDrink {
	
	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		double moneyInPocket = 19;
		
		boolean willBuyDrink = isHotOutside && moneyInPocket > 10.50;
		
		System.out.println(willBuyDrink);
	}
	

}
