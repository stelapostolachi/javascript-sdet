
public abstract class Animal {
	
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();//method has to have abstract class
	public abstract void breathe();
	

	public String getName() {
		return name;
	}
	
	

}
