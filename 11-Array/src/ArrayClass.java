import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
//		int[] myIntArray = new int[10];
//		myIntArray[0]=35;
//		myIntArray[1]=36;
//		
//		int[] myIntArray2= {1,22,33,44,5};
//		
//		System.out.println(myIntArray[1]+"|"+myIntArray2[3]);
		
		int[] myIntegers=userInput(5);
		System.out.println("The average is:"+getAverage(myIntegers));
				
		
	}
	//Create a method get int,will accept one param number,when I put that num 
	//I will put my elements from keybord,and this methord will return that number
	
	public static int[] userInput(int number) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number"+number);
		int [] values = new int[number];
		
		for (int x=0;x<values.length;x++) {
			values[x]=scanner.nextInt();
			
			
		}
		return values;
	}
//recive parameter array , find averg of array sum of num/array size
	public static double getAverage(int[] array) {
		int sum=0;
		
		for (int x=0;x<array.length;x++) {
			sum=sum+array[x];
		}
		return (double)sum/array.length;
	}
}
