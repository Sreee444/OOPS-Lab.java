import java.util.Scanner;
public class prime
{
 public static void main(String[] args)
 {
  int flag=0;
  Scanner A = new Scanner(System.in);
  System.out.println("Enter the number");
  int n = A.nextInt();
  for(i=2;i<n/2;i++)
   {
     if(n%i ==0)
     {
     flag=1;
     break;
     }
   }
  if(flag==1)
   {
     system.out.println("The given number is not prime");
   }
  else
  {
     System.out.println("The given number is prime");
  } 
 }
}
