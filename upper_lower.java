package method_assignment;

public class upper_lower 
{
int[][] a= {
		         {1,2,3},
		         {4,5,6},
		         {7,8,9}
		    
           };
int i,j;

  upper_lower()
  {
	  System.out.println("upper lower matrix");
  }
  
  public void disp()
  {
	  System.out.println("Upper triangular matrix");
	  for(i=0;i<3;i++)
	  {
		  for(j=0;j<3;j++)
		  {
	            if(i>=j)
	            System.out.print(a[i][j]+" ");
	            else
	            	System.out.print(0+" ");
	            
	      
		  }
		  System.out.println( ); 
  }
}
  
  public void disp1()
  {
	  System.out.println("Lower triangular matrix");
	  for(i=0;i<3;i++)
	  {
		  for(j=0;j<3;j++)
		  {
	            if(i<=j)
	            System.out.print(a[i][j]+" ");
	            else
	            	System.out.print(0+" ");
	            
	      
		  }
		  System.out.println( ); 
  }
}
  public static void main(String args[])
  {
	  upper_lower ob=new upper_lower();
	  ob.disp();
	  ob.disp1();
  }
}
