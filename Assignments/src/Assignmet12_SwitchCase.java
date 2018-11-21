
public class Assignmet12_SwitchCase {

	public static void main(String[] args) {
//		Write a method called printNumberInWord
//
//		This method should have one parameter called number which a whole number(type int)
//
//		The method needs to print "ZERO" if the number parameter is passed with the value of 0
//		The method needs to print "ONE" if the number parameter is passed with the value of 0
//		The method needs to print "TWO" if the number parameter is passed with the value of 0
//
//		... and so on up to and including "NINE" if the number parameter is passed with the value of 9
//
//		If the number parameter has any other value than 0 to 9, then the method should print "OTHER"
		printNumberInWord(1);
		printNumberInWord(3);
		printNumberInWord(0);
		printNumberInWord(33);
		printNumberInWord(9);
		
		

	}
	
	public static void printNumberInWord(int number) {
		
		switch(number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
			
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("OTHER");
			
		}
		
	}

}
