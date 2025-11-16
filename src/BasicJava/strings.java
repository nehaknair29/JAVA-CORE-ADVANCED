package BasicJava;

public class strings {

	public static void main(String[] args) {
		String name = "Harry";
		System.out.println(name);
		
		int val = name.length();
		System.out.println("length of the string is: "+val);
		
		String lstring = name.toLowerCase();
		System.out.println("string in lower case: "+lstring);
		
		String ustring = name.toUpperCase();
		System.out.println("string in upper case: "+ustring);
		
		String ob = "    harry ";
		String trim_string = ob.trim();  //removes all white spaces in the string
		System.out.println("string before trimming: "+ob);
		System.out.println("string after trimmimg: "+trim_string);
		
		System.out.println("substring1: " + name.substring(2));
		
		System.out.println("substring2: " + name.substring(1,4));
		
		String rstring = name.replace('r','p');
		System.out.println("string after replacing: "+rstring);
		
		System.out.println("starts with Ha: " + name.startsWith("Ha"));
		
		System.out.println("ends with Ha: " + name.endsWith("Ha"));
		
		System.out.println("character at index 2: " + name.charAt(2));
		
		System.out.println("Index of r: " + name.indexOf("r"));
		System.out.println("Index of s: " + name.indexOf("s")); //character not there in the string
		
		System.out.println("Index of r after index 2: " + name.indexOf("r",3));
		
		System.out.println("last index of r: " + name.lastIndexOf("r"));
		System.out.println("last index of r after 2: " + name.lastIndexOf("r",4));
		
		System.out.println("is it Harry? " + name.equals("Harry"));
		
		System.out.println("is it haRrY? ignore case? " + name.equalsIgnoreCase("haRrY"));
		

	}

}
