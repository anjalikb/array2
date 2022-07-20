*/
package This_kyword;

import java.util.Scanner;


public class second_class 
{
    Scanner x= new Scanner(System.in);
      int a, b;
      
      public void input()
      {
          
          System.out.println(" Enter First Number");
          a=x.nextInt();
          System.out.println(" Enter Second Number");
          b=x.nextInt();
          
       }
      
      public void dis()
      {
          int sum;
          sum=a+b;
          System.out.println("Sum ="+s);
          
      }
    
    
    
    
      public static void main( String rgs[])
      {
          second_class ob= new second_class();
           ob.input();
          ob.dis();
         
          
          
          
      }