package hierarchialinheritance;



public class HierarchialChildB extends HierarchialParent {
	
	
	public void show()
	{
		System.out.println("This is HierarchialChildB");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HierarchialChildB obj = new HierarchialChildB();
		obj.display();
		obj.show();

	}

}
