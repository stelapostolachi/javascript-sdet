import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int counter=1;
		int sum=0;
		
		while(counter<11) {
			System.out.println("Enter a number"+counter);
			
			boolean bool = scanner.hasNextInt();
			if(bool) {
				counter++;
				int number = scanner.nextInt();
				sum = sum+number;

				
				
			}else {
				System.out.println("INvalid number");
				
			}
			scanner.nextLine();//
		}
		System.out.println("Your total is "+sum);
		scanner.close();

	
	}

}
