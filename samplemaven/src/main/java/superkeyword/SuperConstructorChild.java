package superkeyword;

public class SuperConstructorChild  extends SuperConstructor{
	
		public SuperConstructorChild()
		{
			super("This is Parent Class Constructor");
			System.out.println("Constructor from child class");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}
