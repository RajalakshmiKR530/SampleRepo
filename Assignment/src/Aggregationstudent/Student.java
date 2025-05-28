package Aggregationstudent;



public class Student {
	
		
		
		String name;
		int rollnumber;
		 Address ref;
		
	public Student(String name, int rollnumber , Address ref)
	{
		this.name =name;
		this.rollnumber = rollnumber;
		this.ref = ref;
	}
	public void display()
	{
		System.out.println(name + " " + rollnumber + " " + ref.getAddress() + " ");
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Address obj = new Address("ABC");
			Student obj1 = new Student ( "anu", 1,obj);
			obj1.display();
			

		}

}
