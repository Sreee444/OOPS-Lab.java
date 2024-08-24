import java.util.Scanner;
public class Frequency
{
 public static void main(String[] args)
 {
  int i=0 , count=0 , len=0;
  Scanner a =new Scanner(System.in);
  System.out.println("Enter the string");
  String str= a.nextLine().toUpperCase();
  System.out.println("Enter the character");
  char ch= a.nextLine().toUpperCase().charAt(0);
  len=str.length();
  while(i < len)
   {
    if(str.charAt(i)==ch)
    {
     count++;
    }
    i++;
   }
  System.out.println("count of occurance of " + ch + "=" +count);
 }
}
