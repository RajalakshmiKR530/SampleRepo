package hierarchialinheritance;


public class HierarchialChildA  extends HierarchialParent{
	
	
	public void print()
	{
		System.out.println("This is HierarchialChildA");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchialChildA objj = new HierarchialChildA();
		objj.display();
		objj.print();

	}

}
