package method_assignment;

public class replace 
{
int[] a= {26, 0, 67, 45, 0, 78, 
           54, 34, 10, 0, 34};
int i;
public void disp()
{
	for(int i=0;i<a.length;i++)
	{
      if(a[i]==0)
      {
    	  a[i]=1;
      }
	System.out.println(a[i]+" ");
}
}

 public static void main(String args[])
 {
	 replace ob=new replace();
	 ob.disp();
 }
}