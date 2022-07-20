package This_kyword;
class This_constructor
{
      
      This_constructor ()
       {
           
             System.out.println("  Default Constructor Called ");
       }
    
     This_constructor(int b)
       {
           this();
             System.out.println(" The value of a= "+ b);
       }


}





public class This_constructor_call
{
    
       public static void main(String args[])
       {
           This_constructor  ob= new This_constructor(453);
          
       }
    
    
}