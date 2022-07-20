package This_kyword;
class firstme
{
    
    
       public void first_method()
       {
           System.out.println(" The First Method is called ");
           
       }
    
    
     public void second_method()
       {
           first_method();
           System.out.println(" The Second Method is called ");
           
       }
}






public class method_call_internally
{
    
       public static void main( String args[])
       {
         firstme   ob = new firstme();
              ob.second_method();
           
           
       }
    
     
    
}