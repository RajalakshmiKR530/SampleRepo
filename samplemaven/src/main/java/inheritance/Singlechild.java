package inheritance;

public class Singlechild extends Singleparent {
	public void print()
	{
		System.out.println("This is single child");
	}
	public static void main (String args [] )
	{
		Singlechild obj = new Singlechild();
		obj. print();
		obj.display();
	}
	
	

}
