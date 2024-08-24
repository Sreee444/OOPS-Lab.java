import java.util.Scanner;
class mover
{
	void area(double r)
	{
		System.out.println("Area of circle = " +3.14*r*r);
	}
	void area(int l ,int b)
	{
		System.out.println("Area of the rectangle =" +l*b);
	}
	void area(double h , double e)
	{
		System.out.println("Area of the triangle =" + 0.5*h*e);
	}
}
public class MethodOverloading {
 public static void main(String[]args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the radius of the circle :");
	 double x= sc.nextDouble();
	 System.out.println("Enter the lenght and breath of the rectangle :");
	 int y= sc.nextInt();
	 int z= sc.nextInt();
	 System.out.println("Enter the height and base of the triangle :");
	 double m= sc.nextDouble();
	 double n= sc.nextDouble();
	 mover a = new mover();
	 a.area(x);
	 a.area(y,z);
	 a.area(m,n);
 }
}
