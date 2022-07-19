package method_assignment;
import java.util.*;
public class menu 
{
Scanner sc=new Scanner(System.in);
int a,b;
public void menum()
{
	System.out.println("1.ADD");
	System.out.println("2.SUB");
	System.out.println("3.MULT");
	System.out.println("4.DIV");
}
public void input()
{
	System.out.println("ENTER THE FIRST NO");
    a=sc.nextInt();
    System.out.println("ENTER THE SECOND NO");
    b=sc.nextInt();
 }

public void ADD()
{
	System.out.println("Addition"+(a+b));
}
public void SUB()
{
	System.out.println("Substraction"+(a-b));
}

public void MULT()
{
	System.out.println("Multiplication"+(a*b));
}
public void DIV()
 {
	System.out.println("Division"+(a/b));
 }



  public static void main(String args[])



{
	menu me=new menu();
	Scanner pn=new Scanner(System.in);
	System.out.println("enter your hoice");
		int n=pn.nextInt();
		
		 switch(n)
	 {
		 case 1:
		  {
				me.input(); 
				me.ADD();
				break;
		  }
		 
		 case 2:
		  {
				me.input(); 
				me.SUB();

           }
		 
		 case 3:
		  {
				me.input(); 
				me.MULT();
				break;
		  }
		 case 4:
		  {
				me.input(); 
				me.DIV();
				break;
		  }
		  
		  
      }
   }
}
  
