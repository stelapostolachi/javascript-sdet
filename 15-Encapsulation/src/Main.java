
public class Main {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount();
		customer1.setAccountNumber("874534783921654");
		customer1.setBalance(3.2);
		customer1.setName("Stela");
		
		customer1.withdrawal(1000.00);
		customer1.deposit(10000000);

	}

}
