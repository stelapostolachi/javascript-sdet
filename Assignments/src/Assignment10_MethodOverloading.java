
public class Assignment10_MethodOverloading {

	public static void main(String[] args) {
//		Write a method printYearsAndDays with parameter of type long named minutes
//		The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter
//		If parameter is less than 0, print "Invalid Value"
//		Otherwise if parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d"
//		XX represents the original value minutes. YY represents the calculated years. ZZ represents the calculated days.
//
//		Sample Outputs:
//
//		printYearsAndDays(525600); = > "525600 min = 1 y and 0 d"
//		printYearsAndDays(1051200); = > "1051200 min = 2 y and 0 d"
//		printYearsAndDays(561600); = > "561600 min = 1 y and 25 d"
//
//		Tips:
//
//		Use the remainder operator
//		hour = 60 minutes
//		1 day = 24 hours
//		1 year = 365 days
          printYearsAndDays(525600);
          printYearsAndDays(1051200);
          printYearsAndDays(561600);


	}
	
	public static void printYearsAndDays(long minutes) {
		if (minutes<0) {
			System.out.println(("Invalid Value")); 
		}else {
			long years=minutes/60/24/365;
			
			long days = minutes/60/24%365;
			
			
			System.out.println(years+" year "+days+" days");
			
		}
	}

}
