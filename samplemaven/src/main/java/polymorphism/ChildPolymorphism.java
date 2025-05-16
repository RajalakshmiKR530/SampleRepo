package polymorphism;

public class ChildPolymorphism extends ParentPolymorphism {
	
	public void sum(int a,int b)
	{
		super.sum(4,1);
		int sum = a - b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		ChildPolymorphism obj = new ChildPolymorphism();
		obj.sum(4,2);
	}

}
