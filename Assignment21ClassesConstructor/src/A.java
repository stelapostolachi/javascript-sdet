

public class A {
public String str="Java";
public double val;



public A(String str, double val) {
	
	this.str = str;
	this.val = val;
	
	
}

public A() {
	
}


public A(String str) {
	this.str=str;
	
}

public A(String s1) {
	this.s1=s1;
	System.out.println("str: "+s1 +" val:"+val);
}



public void print() {
	System.out.println("str :"+str+" ,val: "+val);
	
}

}