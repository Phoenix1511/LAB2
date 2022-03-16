
public class Employee {
	
	String name,dpt;
	
	Employee(String name,String dpt)
	{
		this.name=name;
		this.dpt=dpt;
	}
	
	void display()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Department: "+dpt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Fayaz","BCA");
		e.display();
		

	}

}
