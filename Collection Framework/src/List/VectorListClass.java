package List;

import java.util.Vector;

public class VectorListClass {
	
	//Vector has an initial size of 10; and the increase capacity is 100%
	//Vector is slow -not good to use

	public static void main(String[] args) {
		Vector <Integer> v= new Vector<Integer>();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(2);
		System.out.println(v.capacity());
	}

}
