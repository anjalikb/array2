package method_assignment;
import java.util.*;
public class sum_inputted11
{
Scanner sc=new Scanner(System.in);
int[] a=new int[10];
int i=1;
int k=0;
sum_inputted11()
{
	System.out.println("Sum of inputted elements");
	
}
 public void dis()
  {
	 while(i!=0)
	 {
		 i=sc.nextInt();
	   a[k]=i;
	   k++;
     }
      int sum=0;
     for(i=0;i<k-1;i++)
     {
    	sum=sum+i;
     }
     System.out.println(sum+"= this is num of inputted no");
  }
 public static void main(String args[])
 {
	 sum_inputted11 ob=new sum_inputted11();
	 ob.dis();
	 
 }
}