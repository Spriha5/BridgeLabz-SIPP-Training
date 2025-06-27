package Day1_ClassAndObject;

public class Circle {
int radius;


Circle(int radius)
{
	this.radius=radius;
}


public double Area()
{
	double  a=3.14*radius*radius;
	return a;
	
}

public double Circumference()
{
	double c=2*3.14*radius;
	return c;
}

public void Display()
{
	System.out.println("radius is: "+radius);
	System.out.println("Area of circle is: "+Area());
	System.out.println("circumfarence of circle is: "+Circumference());
}


public static void main(String[] args)
{
Circle obj=new Circle(5);
obj.Display();

}

}
