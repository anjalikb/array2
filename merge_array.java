package method_assignment;

public class merge_array 
{
int a[]={10,20,30,40,50};
int b[]={1,2,3,4,5};
int c[]=new int [a.length+b.length];
int i,k=0;
int n=b.length-1;
public void disp()
{
	for(i=0;i<a.length;i++)
	{
		c[k]=a[i];
	    k++;
	    c[k]=b[b.length-1];
	    n--;
	    k++;
    }
  System.out.println("sorted array");
  for(i=0;i<c.length;i++)
  {
	 System.out.println(c[i]+"");
  }

 }

public static void main(String args)
{
	merge_array ob=new merge_array();
	ob.disp();
}
}
