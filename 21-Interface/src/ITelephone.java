

public interface ITelephone {//created an interface  and an abstraction
	//can have only abstract methods because there is no body;
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();

}