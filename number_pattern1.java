package method_assignment;

public class number_pattern1 
{
	 int i,j;
	 number_pattern1()
	 {
		System.out.println("NUMBER PATTERN"); 
	 }
	  public void disp()
	  {
		  for(i=5;i>=1;i--)
		  {
			  for(j=1;j<=i;j++)
				  System.out.print(i+" ");
			  
			  System.out.println();
		  }
	  }
	  public static void main(String args[])
	  {
		  number_pattern1 ob=new number_pattern1();
		  ob.disp();
		  
				  
	  }

}