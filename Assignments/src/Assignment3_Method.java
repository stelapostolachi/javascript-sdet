
public class Assignment3_Method {

	public static void main(String[] args) {
//		Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes
//		The method should not return anything(void) and it needs to calculate the megabytes 
		//and remaining kilobytes from the kilobytes parameter.
//
//		Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
		//XX represents the original value kiloBytes. 
		//YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.
//
//		If the parameter kiloBytes is < 0 then print "Invalid Value"
//
//		Sample Output:
//
//		printMegaBytesAndKiloBytes(2050) = > "2050 KB = 2 MB and 2KB"
//
//		Tip:
//
//		1 MB = 1024 KB
		printMegaBytesAndKiloBytes(2050);

	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes>0) {
			int mg = kiloBytes/1024;
			System.out.println("2050 KB = "+mg+" MG");
		}else {
			System.out.println("Invalid Value");
		}
		 
		
		
		
	}


}
