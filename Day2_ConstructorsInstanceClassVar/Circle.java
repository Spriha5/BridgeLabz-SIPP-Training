package Day2_ConstructorsInstanceClassVar;

public class Circle {
	float radius;
	
	public Circle(float radius)
	{
	 this();
	 this.radius=radius;
	 System.out.println(radius);
	}
	public Circle()
	{
		System.out.println("default");
	}
public static void main(String[] args)
{
	Circle obj=new Circle(5.6f);
}
}
