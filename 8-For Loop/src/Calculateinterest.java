
public class Calculateinterest {

	public static void main(String[] args) {
		//how much is the interest for the amount of $10000 and 2% interesRate
		//how much is the interest for the amount of $10000 and 3% interesRate
		//how much is the interest for the amount of $10000 and 4% interesRate
		//how much is the interest for the amount of $10000 and 5% interesRate
		
		System.out.println(calculateInterest(1000,2));
		System.out.println(calculateInterest(1000,3));
		System.out.println(calculateInterest(1000,4));
		System.out.println(calculateInterest(1000,5));
		
		for (int i=2;i<6;i++) {
			System.out.println(calculateInterest(1000,i));
		}

	}
	public static double calculateInterest(double amount, double interestRate) {
		return amount*(interestRate/100);
	}

}
