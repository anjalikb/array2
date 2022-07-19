package method_assignment;
import java.util.*;
public class sum_twono
{
	Scanner sc=new Scanner(System.in);
	int [][] a= {
		        	{1,2,3},
		        	{4,5,6},
		        	{7,8,9}
		        	
	            };
	int i,j;
	sum_twono()
	{
		System.out.println("Sum of two no");
	}
	
	 public void dis()
	 {
		 for(i=0;i<a.length;i++)
		 {
			 for(j=0;j<a.length;j++)
				 System.out.print(a[i][j]+" ");
			 
			 System.out.println();
		 }
	 }
	 
	 public void dis1()
	 {
		 int sum=0;
	  System.out.println("enter the num1");
	  int num=sc.nextInt();
	  System.out.println("enter the num2");
	  int num2=sc.nextInt();
	  for(i=0;i<a.length;i++)
	 {
	  for(j=0;j<a.length;j++)
	   if(a[i][j]==num || a[i][j]==num2)
	   {
		    sum=num+num2;
	
	   }
	 }
	  System.out.println("Sum of two no in matrix = "+sum);
	 }
	 public static void main(String args[])
	 {
		 sum_twono ob=new sum_twono();
		 ob.dis();
		 ob.dis1();
	 }
}
