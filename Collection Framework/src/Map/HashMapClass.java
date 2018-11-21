package Map;


import java.util.*;

public class HashMapClass {//doesen't hold the order it prints randomly 

	public static void main(String[] args) {
		
		//HashMap-fast,unsynchronized,works with single thread,allows one null key
		//HasTable - slow,synchronized ,works with multiple thread, does not allow null key
		//LinkedHashMap-preserves the insertion order.
		//Map map = new HashMap();
        Map<String,String>map = new HashMap<>();//key is string value is string 
        map.put("myName", "Stela");
        map.put("myjob", "tester");
        map.put("myAge", "20");
        map.put("x", "y");
        
        System.out.println(map);
        System.out.println(map.get("myName"));
        System.out.println(map.get("myName2"));
        
        Set <String> keys=map.keySet();//is colecting all the keys
        for(String key:keys) {
        	map.get(keys);
        	System.out.println(key+" "+map.get(key));
        }
	}

}
