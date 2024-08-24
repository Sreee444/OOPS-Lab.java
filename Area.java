import java.util.Scanner;
public class Area
{
 public static void main (String[] args)
 {
  int area;
  Scanner S = new Scanner(System.in);
  System.out.println("Enter the lenght and Breadth");
  int a = S.nextInt();
  int b = S.nextInt();
  area = a*b;
  System.out.println("Area of the Rectangle = " +area);
 }
}
