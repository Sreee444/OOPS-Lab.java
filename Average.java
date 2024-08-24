import java.util.Scanner;
public class Average
{
 public static void main (String[] args)
 {
  float avr;
  Scanner S = new Scanner(System.in);
  System.out.println("Enter the three Numbers");
  int a = S.nextInt();
  int b = S.nextInt();
  int c = S.nextInt();
  avr = (a + b + c)/3;
  System.out.println("Average = "+avr);
 }
} 
