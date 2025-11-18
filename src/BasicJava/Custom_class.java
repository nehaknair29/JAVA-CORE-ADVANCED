package BasicJava;

class Employee{
	int id;
	String name;
	int salary;
	public void printDetails(){
		System.out.println("My ID is " + id);
		System.out.println("And my name is " + name);
	}
	
	public int getSalary() {
		return salary;
	}
}
public class Custom_class {
	public static void main(String[] args) {
		 System.out.println("This is a custom class.");
		 Employee harry = new Employee();//initializing new employee object
		 Employee john = new Employee();
		 harry.id = 12;
		 harry.salary = 120000;
		 harry.name = "CodeWithHarry";
		 
		 john.id = 17;
		 john.salary = 240000;
		 john.name = "John Khandelwal";
		 
//		 System.out.println(harry.id);
//		 System.out.println(harry.name);
		 /*
		  * instead of printing it seperately we can are
		  * gonna use a method name printDetails which was 
		  * declared in class Employee
		  */
		 harry.printDetails();
		 john.printDetails();
		 int salary = john.getSalary();
		 
	}
}
