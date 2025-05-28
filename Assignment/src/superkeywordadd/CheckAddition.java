package superkeywordadd;

public class CheckAddition extends Addition {
	
	public void display()
	{
		
		
		int result = super.add(20, 7);;
		
		if( result % 10 == 0)
			
		{
			System.out.println("Divisible by Ten");
		}
		else
		{
			System.out.println(" Not Divisible by Ten");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckAddition obj = new CheckAddition();
		obj.display();
		

	}

}
