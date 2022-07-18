package method_assignment;
import java.util.*;
public class perticular_ele 
{
Scanner sc=new Scanner(System.in);
int[] a=new int[10];
int i;
int c=0;
public void input()
{
	System.out.println("ENTER THE ELEMENTS IN ARRAY");
	for(i=0;i<a.length;i++)
	a[i]=sc.nextInt();
}
public void disp()
{
	 System.out.println("enter the element");
	 int el=sc.nextInt();
	for(i=0;i<a.length;i++)
	{
		if(a[i]==el)
		{
			c++;
		}
	  
	}
	System.out.println(c +" = thimes found the element in array");
}
  public static void main(String args[])
  {
	  perticular_ele ob=new perticular_ele();
	  ob.input();
	  ob.disp();
  }
}