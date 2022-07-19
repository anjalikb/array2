package method_assignment;
import java.util.*;
public class transpose 
{
	Scanner sc=new Scanner(System.in);
	transpose()
	{
		System.out.println("This is transpose matrix");
	}
	public void display()
	{
		int[][] a=new int[3][3];
		int i,j;
		System.out.println("ENTER THE ELEMENTS");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			a[i][j]=sc.nextInt();
	
		}
		System.out.println("Matrix 1");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			System.out.print(a[i][j]+" ");
			
			System.out.println();
		}
		System.out.println("transpose matrix");
		  for(i=0;i<a.length;i++)
		  {
			  for(j=0;j<a.length;j++)
				System.out.print(a[j][i]+" ");
			  
			   System.out.println();
		  }

    }
         public static void main(String args[])
         {
        	 transpose transpo=new transpose();
        	 transpo.display();
         }
}