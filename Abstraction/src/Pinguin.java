
public class Pinguin extends Bird{//since you extending from bird you have to override abstract fly method you can not skip this one

	public Pinguin(String name) {
		super(name);
		
	}

@Override
public void fly() {
	System.out.println("In not flying.");	
}
	

}
