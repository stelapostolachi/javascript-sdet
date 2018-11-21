
public class Dog extends Animal {

	public Dog(String name) {
		super(name);//inheritance from Animal
		//when you create a concrete class you have to override the animal abstract methods 
		
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in , breathe out");
		
	}
	

}
