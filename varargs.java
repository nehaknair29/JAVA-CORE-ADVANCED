package BasicJava;

public class varargs {
//	static int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	static int sum(int a, int b) {
//		return a+b;
//	}
	//above is the example of method overloading
	// or use varargs syntax sum(int ...arr) it can have zero or more arguments 
	static int sum(int ...arr) {
		int sum = 0;
		for(int a: arr) {
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("The sum of 4 and 5 is:" + sum(4, 5));
		System.out.println("The sum of 4, 3 and 5 is:" + sum(4, 5, 5));
		System.out.println("The sum of nothing is :" + sum());
	}
	
	
	

}
