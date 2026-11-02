package BasicJava;

class Employee2{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String SetName(String n) {
		name = n ;
		return name;
	}
}

class cellphone{
	public void ringing() {
		System.out.println("Ringing...");
	}
	public void vibrating() {
		System.out.println("Vibrating...");
	}
	public void call() {
		System.out.println("Calling Nakul");
	}
}

class calculation{
	int side;
	public int area() {
		int area = side * side;
		return area;
	}
	public int perimeter() {
		int perimeter = 4 * side;
		return perimeter;
	}
}

class calc{
	int l;
	int b;
	public int area1() {
		return l*b;
	}
	public int perimeter1() {
		return 2*(l+b);
	}
}

class calc_c{
	float radius;
	public float area2() {
		return 2*3.14f*radius*radius;
	}
	public float perimeter2() {
		return 2*3.14f*radius;
	}
}

class TommyVecetti{
	public void hit() {
		System.out.println("Hitting the enemy");
	}
	public void fire() {
		System.out.println("Firing on the enemy");
	}
	public void run() {
		System.out.println("Running from the enemy");
	}
}

public class ObjectOP {

	public static void main(String[] args) {
		Employee2 harson = new Employee2();
		Employee2 david = new Employee2();
		Employee2 Dhruv = new Employee2();
		
		harson.salary = 120000;
		harson.name = "Harson Philip";
		
		david.salary = 220000;
		david.name = "David Abraham";
		
		Dhruv.salary = 123000;
		Dhruv.name = "Dhruv Keshav";
		
		System.out.println(harson.getSalary());
		System.out.println(david.getName());
		System.out.println(Dhruv.SetName("Nathan"));
		System.out.println(harson.SetName("Machiel"));
		
		
		cellphone a35 = new cellphone();
		a35.call();
		a35.ringing();
		a35.vibrating();
		
		calculation square = new calculation();
		square.side = 5;
		System.out.println(square.area());
		System.out.println(square.perimeter());
		
		calc rectangle = new calc();
		rectangle.l=10;
		rectangle.b=10;
		System.out.println(rectangle.area1());
		System.out.println(rectangle.perimeter1());
		
		calc_c circle = new calc_c();
		circle.radius=10;
		System.out.println(circle.area2());
		System.out.println(circle.perimeter2());
		
		TommyVecetti player1 =new TommyVecetti();
		player1.fire();
		player1.run();
		player1.hit();

	}

}
