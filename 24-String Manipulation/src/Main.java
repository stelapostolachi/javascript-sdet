
public class Main {

	public static void main(String[] args) {
		// charAt(index)=returns char value for the particular index
		String str = "JavaScript";
		System.out.println(str.charAt(3));//a
		//length()-returns string length
		System.out.println(str.length());//10
		
		//substring(int beginIndex)-returns substring for given begin index
		System.out.println(str.substring(5));//cript
		
		//substring(int beginIndex, int endIndex)-returns substring for given begin index and end index
        System.out.println(str.substring(2, 6));//vaSc
        
        //contains()-returns truea or false after matching the sequence of char value
        System.out.println(str.contains("va2"));//false
        
        //wquals(object another)-checks the equality of string with the given object
        System.out.println(str.equals("JavaScript"));//true
        
        //isEmply()-checks if the string is empty
        System.out.println(str.isEmpty());//false
        
        //concat(string str)- concatenates the specified string
        System.out.println(str.concat("batch9"));//JavaScriptbatch9
        
        //replace(char old, , char new)-replaces all occurrences of the specified char value
        System.out.println(str.replace("Script", ""));//Java
        
        //equalsIgnoreCase(string another) - compares another string. It does not check case.
        System.out.println(str.equalsIgnoreCase("javascript"));//true
        
        //split(String delimeter)-returns a split matching delimeter
        String str2 = "Java is the best batch ever";
        String[]myArray = str2.split(" ");
        for(String word:myArray) {
        	System.out.println(word);//split each word by spacess returning the words line after line.
        	
        	
        }
        
        
        //indexOf()-returns the specified char value index
        System.out.println(str.indexOf("v"));//getting the value and returning the index
        
        //indexOf(String substring,int fromIndex) - returns the specified substring index starting with giving
        System.out.println(str.indexOf("a", 1));
        
        //toLowerCase ()-return string in lower case
        System.out.println(str.toLowerCase());//javascript
        
        //trim()- remove beginning  and ending spaces
        System.out.println(str.trim());//JavaScript
        
        		
      

	}

}
