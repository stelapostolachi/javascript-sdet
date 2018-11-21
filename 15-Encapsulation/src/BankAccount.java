
public class BankAccount {
	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	public void deposit(double amount) {
		this.balance = balance+ amount;
		
	}
	public void withdrawal(double withdrowellamount) {
		if(this.balance-withdrowellamount<0) {
			System.out.println("Only "+this.balance+" available. Withdrawel not process.");
		}else {
			this.balance = withdrowellamount;
			System.out.println("Withdrawal of "+withdrowellamount+" process. Remaining balance ="+this.balance+".");
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}