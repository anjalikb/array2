package method_assignment;
import java.util.*;
import java.util.Scanner;

public class count_odd
{
	Scanner sc=new Scanner(System.in);
int sum=0;
int c=1;
int i;
int[] a=new int[10];
public void input()
{
	System.out.println("ENTER THE ELEMENTS IN ARRAY");
	for(int i=0;i<a.length;i++)
	a[i]=sc.nextInt();
}
public void disp()
{
	for(i=0;i<a.length-1;i++)
     if(a[i]%2!=0)
     {
    	 sum=sum+a[i];
          c++;
	
	}
	System.out.println("This is sum of odd no in array = "+sum);
	System.out.println("The no of count odd no in array = "+c);
}
public static void main(String args[])
{
	count_odd ob=new count_odd();
	ob.input();
	ob.disp();
	
}

}