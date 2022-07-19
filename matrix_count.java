package method_assignment;
import java.util.*;
public class matrix_count
{
	Scanner sc=new Scanner(System.in);
int[][] a= {
		     {1,2,3},
		     {4,5,6},
		     {7,4,3}
           };
 int c=0;
 int i,j;
 matrix_count()
 {
	 System.out.println("count the no");
 }

 public void  matrix1()
 {
   System.out.println("enter the no you have count");
   int num=sc.nextInt();
   for(i=0;i<3;i++)
   {
	   for(j=0;j<3;j++)
	   {
		    if(a[i][j]==num)
		      c++;
	   
	 
	   }
   }
   System.out.println(c +"= times no is found."); 
 }
 public static void main(String args[])
 {
	 matrix_count ob=new matrix_count();
	 ob.matrix1();
 }
 
}