package BasicJava;

class MyEmployee{
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setname(String n) {
		name = n;
	}
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}
public class Modidfiers {

	public static void main(String[] args) {
		MyEmployee harry = new MyEmployee();
		//harry.id = 45;
		//harry.name = "CWHarry"; --> throws an error due to private access modifier
		harry.setname("CWHarry");
		System.out.println(harry.getName());
		harry.setId(29);
		System.out.println(harry.getId());
	}

}
