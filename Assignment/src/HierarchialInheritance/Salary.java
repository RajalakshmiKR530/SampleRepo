package HierarchialInheritance;

public class Salary extends HraAndPf {
	
	public void total()
	{
		double salary  = basicpay + hra + bouns;
		double totaldeductions = pf + deduction;
		double totalsalary = salary - totaldeductions;
		
		System.out.println("     /Salary Slip /   ");
		System.out.println("Basic Pay        =  "    +   basicpay);
		System.out.println("Deduction        =  "    +   deduction);
		System.out.println("Bouns            =  "    +   bouns);
		System.out.println("Hra              =  "    +   hra);
		System.out.println("Pf               =  "    +   pf);
		System.out.println("Salary           =  "    +   salary);
		System.out.println("Total Deductions =  "    +   totaldeductions );
		System.out.println("Total Salary     =  "    +   totalsalary);
	}
		
		public static void main(String [] args)
		{
			
		Salary obj = new Salary();
		obj.display();
		obj.calculate();
		obj.total();
		
		}
		
		
		
		
	}


