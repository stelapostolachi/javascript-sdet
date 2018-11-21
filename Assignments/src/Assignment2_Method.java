
public class Assignment2_Method {

	public static void main(String[] args) {
//		The cat spend most of the day playing. In particular, they play if the temperature is between 25 and 35(inclusive). 
		//Unless it is summer, then the upper limit is 45(inclusive) instead of 35.
//
//		Write a method isCatPlaying that has 2 parameters. Method needs to return true if cat is playing, otherwise return false.
//		First parameter should be of type boolean and be named summer it represents if it is summer. Second parameter represents
		//the temperature and is 
		//of type int with the name temperature.
//
//		Sample Outputs:
//
//		isCatPlaying(true,10) = > false
//		isCatPlaying(false,36) = > false
//		isCatPlaying(false,35) = > true
		
		isCatPlaying(true,10);
		isCatPlaying(false,36);
		isCatPlaying(false,35);
		
		

	}
	
	public static void isCatPlaying(boolean summer, int temperature) {
		if(temperature>25 && temperature< 36) {
			System.out.println("True "+temperature);
		}else  {
			System.out.println("False "+temperature);
		}
		
	}

}
