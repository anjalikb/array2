package method_assignment;

public class number_pattern2 
{
	 int i,j;
	 number_pattern2()
	 {
		System.out.println("NUMBER PATTERN"); 
	 }
	  public void disp()
	  {
		  for(i=1;i<=5;i++)
		  {
			  for(j=i;j<=5;j++)
				  System.out.print(j+" ");
			  
			  System.out.println();
		  }
	  }
	  public static void main(String args[])
	  {
		  number_pattern2 ob=new number_pattern2();
		  ob.disp();
		  
				  
	  }

}

