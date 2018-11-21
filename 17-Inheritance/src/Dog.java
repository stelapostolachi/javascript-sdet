
public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	//create constructor
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight); //supper means go to parent class Animal with 5 parameters  and
		//go back where you started from.
		//you can"t 
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		
		//all properties are assigned 
		
	}
	//Dog can have specific methods
	public void chew(){
		System.out.println("Dog.chew() called");
		
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
	}
	//overiding -if I have a method in parend and I want it in child , java will overide it. 
	
	@Override //means when somewone looks at that code the same method exist in parent class.
	public void eat() {
		System.out.println("Dog.eat() called");//calling from child dog class
		super.eat();//go to parent Animal find eat method and will print that method .
		chew();
		
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		super.move(50);//inheriting from parent the method with super.methor()
	}
	

}
