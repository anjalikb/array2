package method_assignment;

public class matrix_col 
{
	int[][] a= {
		      {1,2,3},
		      {4,5,6},
		      {7,8,9}
         };
int r=a.length;
int c=a[0].length;

int i,j;
matrix_col()
{
	System.out.println("Sum of column in matrix");
}

public void disp()
{
	  System.out.println("original matrix");
	  for(i=0;i<3;i++)
	  {
		  for(j=0;j<3;j++)
	  
	  System.out.print(a[i][j]+" ");
	  
	     System.out.println();
	  }
}

public void disp1()
{int sum=0;
	  for(i=0;i<r;i++)
	  {  
		  for(j=0;j<1;j++)
		   sum=sum+a[i][0];
	  }
	   System.out.println("sum of 1st column = "+sum);
}

public void disp2()
{int sum=0;
	  for(i=0;i<r;i++)
	  {  
		  for(j=1;j<2;j++)
		   sum=sum+a[i][1];
	  }
	   System.out.println("sum of 2nd column = "+sum);
}
public void disp3()
{   int sum=0;
	  for(i=0;i<r;i++)
	  {  
		  for(j=2;j<3;j++)
		   sum=sum+a[i][2];
	  }
	   System.out.println("sum of 3rd column = "+sum);
}
public static void main(String args[])
{
	  matrix_col ob=new matrix_col();
	  ob.disp();
	  ob.disp1();
	  ob.disp2();
	  ob.disp3();
 }
}