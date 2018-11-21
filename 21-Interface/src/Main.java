
public class Main {

	public static void main(String[] args) {
		
		//make it apropriate to polimorthism 
		ITelephone mikePhone = new DeskPhone(20020200,true);
		mikePhone.powerOn();
		mikePhone.callPhone(20020200);//needs to be as Deskphone nr to be able to ring.
		mikePhone.answer();

	}

}
