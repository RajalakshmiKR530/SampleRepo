package abstraction;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild obj = new AbstractionChild(); //object creation
		
		obj.print();
		obj.display();
		obj.show();
		
	/*	AbstractionParent obj1 = new AbstractionChild(); //reference creation
		obj1.display();
		obj1.print();*/
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("world");
		
		
	}
	
	public void show()
	{
		System.out.println("New");
	}

}
