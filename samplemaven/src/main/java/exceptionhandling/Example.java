package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 0;
		try
		{
			int c =a/b; //these line cause arithmetic exception division by zero
		}
			/*catch(ArithmeticException e)
		{
				b = 2;
				int d = a/b; // again arithmetic exception
				System.out.println(e); // print the exception details
				System.out.println(d);
				
		}*/
		
		finally
		{
			System.out.println("inside"); // these block always run
			b = 2;
			int d = a/b; //again arithmetic exception,unhandled  here
			System.out.println(d);
			
		}
			
		
		

	}

}
