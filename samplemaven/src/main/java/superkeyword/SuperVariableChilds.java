package superkeyword;

public class SuperVariableChilds extends SuperVariables {
String color = "blue";
	
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChilds obj = new SuperVariableChilds();
		obj.display();

	}

}
