import java.util.Scanner;

public class Assignment17_userInput {

	public static void main(String[] args) {
//		Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
//		Before the user enters the number, print the message "Enter number"
//		If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//		Hint:
//		Use an endless while loop
		
//		int userNumber=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a minumum number.");
//	    userNumber = scanner.nextInt();
//	    
//	    while(userNumber>0) {
//	    	System.out.println("Enter a minumum number.");
//		    userNumber = scanner.nextInt();
//	    }
//		
		
        int number;
        int maximNumber = 0;
       
        

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();

        while(number>0)
        {
            System.out.println("Enter the number: ");
            number = input.nextInt();

            

          
           
        }

        
    }

	

}
