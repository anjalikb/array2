package This_kyword;

public class this_keyword
{
int id;
String name;
public void input(int id,String name)
{
	this.id=id;
	this.name=name;
}
  public void dis()
  {
	  System.out.println("Nmae="+name);
	  System.out.println("ID="+id);
  }


	public static void main(String args[])
	{
		this_keyword ob=new this_keyword();
		ob.input(123,"Anjali");
		ob.dis();
	}
}
