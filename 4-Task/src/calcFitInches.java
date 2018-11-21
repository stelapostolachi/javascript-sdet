
public class calcFitInches {

	public static void main(String[] args) {

//		calcFeetAndInchesToCentimeters(-10, 0);
//		calcFeetAndInchesToCentimeters(0, 1);
//		
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		

	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet<0 || inches<0 || inches>12) {
			System.out.println("Invalid print");
			return -1;
		}else {
			double centimeters= (feet*12)*2.54;
			centimeters+=inches*2.54;
			
			System.out.println(feet+"feet "+inches+" inches= "+centimeters+" centimeters.");
			return centimeters;
			
		}
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
		System.out.println("Invalid result");
			return -1;
		}else {
			double feet= (int)inches/2.54;
			double remainingInches = (int)inches%12;
			System.out.println(inches+ " inches= "+feet+" feet and "+remainingInches+" inches ");
			return calcFeetAndInchesToCentimeters(feet,remainingInches);
					
		}
	}

}
