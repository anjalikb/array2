package method_assignment;

public class matrix_row
{
	int[][] a= {
			      {1,2,3},
			      {4,5,6},
			      {7,8,9}
	           };
	int r=a.length;
	int c=a[0].length;
     
     int i,j;
	matrix_row()
	{
		System.out.println("Sum of row's in matrix");
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
		  for(i=0;i<1;i++)
		  {  
			  for(j=0;j<c;j++)
			   sum=sum+a[0][j];
		  }
		   System.out.println("sum of 1st row = "+sum);
	  }
	  
	  public void disp2()
	  {int sum=0;
		  for(i=1;i<2;i++)
		  {  
			  for(j=0;j<c;j++)
			   sum=sum+a[1][j];
		  }
		   System.out.println("sum of 2nd row = "+sum);
	  }
	  public void disp3()
	  {   int sum=0;
		  for(i=2;i<3;i++)
		  {  
			  for(j=0;j<c;j++)
			   sum=sum+a[2][j];
		  }
		   System.out.println("sum of 3rd row = "+sum);
	  }
	  public static void main(String args[])
	  {
		  matrix_row ob=new matrix_row();
		  ob.disp();
		  ob.disp1();
		  ob.disp2();
		  ob.disp3();
	  }
}