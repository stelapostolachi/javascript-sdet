
public class DataTypes {

	public static void main(String[] args) {
		// byte
		byte b1 = 25;
		byte b2 = -128;
		byte b3 = 127;
		System.out.println(b1+"|"+b2+"|"+b3);
		//byte b4=128 will give error needs to be different data type
		System.out.println("---------------");
		
		//short
		short s1 = 500;
		short s2 = -32768;
		short s3 = 32767;
		//short s4 = 32768 is not a valid declaration
		System.out.println(s1+"|"+s2+"|"+s3);
		System.out.println("---------------");
		
		//int
		int i1=-50000;
		int i2=100_000;
		int i3 = 50000;
		System.out.println(i1+"|"+i2+"|"+i3);
		System.out.println("---------------");
		
		//long
		long l1 = 100_000_000;
		long l2 = 2144567898765L;//need to specify L, at the end without will be error.ex credit card
		System.out.println(l1+"|"+l2);
		System.out.println("---------------");
		 
		//float : floating point type have double as default type
		float f1= 5.2f;
		double d1=5.2;
		
		//boolean
		boolean bool=true;
		boolean bool2 = false;
		
		//char
		char c1 = 'D';//one character , '' single code 
		char c2 = '2';
		char c3 = '\u00A9';//register symbols
		
		
		
		
		
		
		
		
		
		

	}

}
