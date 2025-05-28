package  HierarchialInheritance;
import java.util.Scanner;

public class Employee {
	
	double basicpay;
	double deduction;
	double bouns;
	double hra;
	double pf;
	
	public void display()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Basic Pay = " );
		basicpay = in.nextDouble();
		System.out.println("Enter the Deduction = " );
		deduction = in.nextDouble();
		System.out.println("Enter the Bouns = " );
		bouns = in.nextDouble();
	}
	
	

}
