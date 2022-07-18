package method_assignment;
import java.util.*;
public class even_position
{
	Scanner sc=new Scanner(System.in);
	int[] a=new int[10];
	int i;
	public void input()
	{
		 System.out.println("ENTER THE ELEMENTS IN ARRAY");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		System.out.println("position of even no");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String args[])
	{
		even_position ob=new even_position();
		ob.input();
		ob.disp();
	}
}