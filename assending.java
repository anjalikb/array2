package method_assignment;
import java.util.*;
public class assending 
{
Scanner sc=new Scanner(System.in);
int i,j,k;
int[] a=new int[10];
assending()
{
	System.out.println("Sort the array by assending order and find min no in array.");
}
public void input()
{
	System.out.println("enter the elements in array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
}
 public void disp()
 {
	 for(i=0;i<a.length;i++)
	 {
		 for(j=i+1;j<a.length;j++)
		 {
			 if(a[i]>a[j])
			 {
				 k=a[j];
				 a[j]=a[i];
				 a[i]=k;
			 }
		 }
	 
	 }
	 System.out.println("This is sorted array");
	 for(i=0;i<a.length;i++)
		 {
		    System.out.println(a[i]+" ");
		 }
	 System.out.println("This is 3rd min no in sorted array = "+a[2]);
}
 public static void main(String args[])
 {
	 assending ob=new assending();
	 ob.input();
	 ob.disp();
 }
}
