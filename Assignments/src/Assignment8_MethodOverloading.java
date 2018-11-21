
public class Assignment8_MethodOverloading {

	public static void main(String[] args) {
//		Create a method called getDurationString with two parameters, 
		//first parameter is minutes and second parameter is seconds.
//
//		You should validate that if the first parameter minutes is >=0.
//
//		You should validate that second parameter seconds is >=0 and <=59
//
//		Return "Invalid Value" in the method if either of the above is not true.
//
//		If the parameters are valid then calculate how many hours minutes and 
		//seconds comprise the minutes and seconds passed to this method and return 
		//that value as string in format "XXh XXm XXs" where XX represents a number of hours minutes and seconds.
//
//		Create a second method of the same name but with only one parameter seconds.
//
//		Validate that it is >=0, and return "Invalid Value" if it is not true.
//
//		If it is valid, then calculate how many minutes are in the seconds then call the
		//other overloaded method passing the correct minutes and seconds calculated so that
		//it can calculate correctly.
//
//		Call both methods to print values in main method
//
//		Tips:
//		Use int or long for your number data types
//		1 minute = 60 seconds and 1 hour = 60 minutes = 3600 seconds.
		getDurationString(3608);
		getDurationString(9600);


	}
	public static String getDurationString(int minutes, int seconds) {
		if( minutes<0 || seconds<0 || seconds>59) {
			return ("Invalid Values");
			
		}else {
			int hours = minutes/60;
			int minute = minutes%60;
			return (hours+"h"+ minute+"m" + seconds +"s");
		}
	}
	
	public static void getDurationString(int seconds2) {
		if(seconds2<=0) {
			System.out.println("Invalid Value");
		}else {
			int  min =seconds2 /60;
			int sec = seconds2%60;
			System.out.println(getDurationString(min,sec ));
			
		}
		
	}
	

}
