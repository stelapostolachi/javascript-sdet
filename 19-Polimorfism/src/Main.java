
public class Main {

	public static void main(String[] args) {
//		Dog dog1 = new Dog();
//		dog1.speak();
//		
//		Cat cat1 = new Cat();
//		cat1.speak();
//		
//		Bird bird1 = new Bird();
//		bird1.speak();
		
		//Polymorthism-One object can get in to different forms 
		
		
//		Animal a1 = new Dog();//reference is Animal
//		a1.speak();
//		
//		Animal a2 =  new Cat();
//		a2.speak();
//		
//		Animal a3 = new Bird();
//		a3.speak();
		
		Animal a= new Dog();//we created one object to print 3 class objects.
		
		a = new Cat();
		a.speak();
		
		a= new Bird();//Java working in the memory witch is Animal this is why we can use the same object to call different class objects.  
		a.speak();//they need to have a connection between them inheritance.. 
		
		a= new Dog();
		a.speak();
//use this a lot in automation

	}

}
