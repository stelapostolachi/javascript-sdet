
public class Assignment_1 {

	public static void main(String[] args) {
//Write a JAVA program to calculate the tax:
//income ≤ 150,000,000 tax ratio %25
//income ≤ 300,000,000 tax ratio %30
//income ≤ 600,000,000 tax ratio %35
//income ≤ 1,200,000,000 tax ratio %40
//income > 1,200,000,000 tax ratio %50
//
//Create needed variables and print the tax 

		long income = 21_200_000_000l;
		if(income<=150_000_000) {
			long result=income*(100/25);
			System.out.println(result+" You have with -25% tax.");
		}else if(income<=300_000_000) {
			long result2=income*(100/30);
			System.out.println(result2+" You have with -30% tax.");
		}else if (income<=600_000_000) {
			long result3 = income*(100/35);
			System.out.println(result3+" You have with -35% tax.");
		}else if(income<=1_200_000_000) {
			long result4 = income*(100/40);
			System.out.println(result4+" You have with -40% tax.");
		}else if(income>1_200_000_000) {
			long result5 = income*(100/50);
			System.out.println(result5+" You have with -50% tax.");
		}
		
		
	}

}
