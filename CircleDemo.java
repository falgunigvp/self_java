import java.util.*;
class Circle
{
	int x,y;
	double r;
	
	
	public void draw()
	{
		System.out.println("Hi");
	}
	public double ara()
	{
		return Math.PI*r*r;
	}
	public void SetR(double r)
	{
		this.r=r;
	}
}
class CircleDemo
{
	public static void main (String[] args)
	{
		Circle c = new Circle();
		
		c.SetR(10);
		System.out.println("" +  c.ara());
	
	}
}	