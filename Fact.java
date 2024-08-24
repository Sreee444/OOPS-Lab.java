import java.util.Scanner;
public class Fact
{
 public static void main (String[] args)
 {
  int fact = 1,i;
  Scanner A = new Scanner(System.in);
  System.out.println("Enter the number");
  int n = A.nextInt();
  for(i=1;i<=n;i++)
  {
   fact=fact*i;
  }
   System.out.println("The factorial ="+fact);
 }
}
