import java.util.Scanner;

public class Matrix {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int r1,c1,i,j;
		System.out.println("Enter the Row of the fisrt matrix");
	    r1 = sc.nextInt();
	    System.out.println("Enter the column of the fisrt matrix");
	    c1 = sc.nextInt();
	    int A[][] = new int[r1][c1];
	    System.out.println("Enter the elements of the matrix");
	    for(i=0;i<r1;i++)
	     {
	       for(j=0;j<c1;j++)
	       {
	    	   A[i][j]=sc.nextInt();
	       }
	     }
	    System.out.println("The matrix is :");
	    for(i=0;i<r1;i++)
	     {
	       for(j=0;j<c1;j++)
	       {
	    	   System.out.print(A[i][j]);
	    	   System.out.print(" ");
	       }System.out.println();
	     }
	}
}
