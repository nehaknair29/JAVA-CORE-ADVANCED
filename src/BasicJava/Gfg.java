package BasicJava;

public class Gfg {

	public static void main(String[] args) {
		String str = "Hello";
        System.out.println(str instanceof String); 

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer); 
        System.out.println(obj instanceof String); 
        
        int a = 10, b = 20;
        int max = (a > b) ? a : b;

        System.out.println("Maximum is " + max);
        
        String[] names = { "Sweta", "Gudly", "Amiya" };

        for (String name : names) {
            System.out.println("Name: " + name);
        }
        
        for (int i = 0; i < 10; i++) {
            
            // Empty body no operations
        }
        
        for (int i = 0; i < 3; i++) {
            one : { // label one
            two : { // label two
            three : { // label three
                System.out.println("i=" + i);
                if (i == 0)
                    break one; // break to label one
                if (i == 1)
                    break two; // break to label two
                if (i == 2)
                    break three; // break to label three
            }
                System.out.println("after label three");
            }
                System.out.println("after label two");
            }
                System.out.println("after label one");
            }
        
        

	}

}
