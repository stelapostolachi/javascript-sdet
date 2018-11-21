
public class StaticMethods {

	public static void main(String[] args) {
		Abc.show1();//static method you can call by class name
		
		
		Abc x= new Abc();//to call a instance we need to create an object
		x.show2();
//Whenever you say static it means that belongs to that class and you can directly call the with the name
		//1 static method can not call instance method
		//2 instance method can call instance  and static belongs to the object.
	}

}

class Abc{
	public static void show1() {
		System.out.println("Hello1");
		//show2();//static method, you can not run static method from instance method 
		show4();//it will work because is static method.
	}
	public void show2() {//instance method 
		System.out.println("Hello2");
		show1();//you can  call static method from instance method 
	}
	public void show3() {
		System.out.println("Hello3");
		show2();//you can call instance method from instance method 
		show1();//you can  call static method from instance method 
	}
	public static void show4() {
		System.out.println("Hello4");
	}
}