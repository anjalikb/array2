package method_assignment;
import java.util.*;
public class insertion 
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	insertion()
	{
		System.out.println("Insertion Of Array");
	}
	public void disp()
	{
		System.out.println("enter the size of array");
		 int s=sc.nextInt();
		 System.out.println("enter the elements");
		 int el=sc.nextInt();
		 System.out.println("enter the position ");
		 int p=sc.nextInt();
		 int[] a=new int[s+1];
		 for(i=0;i<s;i++)
		 {
			a[i]=sc.nextInt();
		 }
		 for(i=a.length-1;i>p-1;i--)
		 {
			 a[i]=a[i-1];
			
		 }
		 a[p-1]=el;
		 System.out.println("Insertion Array");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		insertion ob=new insertion();
		ob.disp();
	}

}
