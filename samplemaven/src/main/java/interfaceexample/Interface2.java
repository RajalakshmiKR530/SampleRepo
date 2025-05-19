package interfaceexample;

public class Interface2 implements Interface1 {
	
	public void display1()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Interface2 obj = new Interface2();
		obj.display();
		obj.display1();
		obj.print(); */
		
		Interface1 obj1 = new Interface2();
		obj1.display();
		obj1.print();
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("World");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

}
