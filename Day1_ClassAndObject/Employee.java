package Day1_ClassAndObject;

public class Employee {
	String name;
	int id;
	int salary;
	
	Employee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	public static void main(String[] args)
	{
		Employee obj1=new Employee("Spriha",156,1500000);
		System.out.println(obj1.name);
		System.out.println(obj1.id);
		System.out.println(obj1.salary);
	}

}
