package superkeyword;

public class SuperMethodsChild extends SuperMethods {
	
	public void print()
	{
		super.display();
		System.out.println("THis is Child class Super Methods");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodsChild obj = new SuperMethodsChild();
		obj.print();
		//obj.display();

	}

}
