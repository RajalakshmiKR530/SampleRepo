package aggregation;

public class ChildAggregation {
	
	String state;
	String city;
	ParentAggregation ref;
	
	
	
	public ChildAggregation(String state, String city, ParentAggregation ref)
	{
		this.state =state;
		this.city = city;
		this.ref =ref;
		 
	}
	public void display()
	{
		System.out.println(city + "  " + state);
		System.out.println(ref.name + " " + ref.rollnumber + "  " + ref.address );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ParentAggregation obj = new  ParentAggregation("Anu", 1,"TSR");
		 ChildAggregation obj1 = new ChildAggregation("TSR","Kerala",obj);
		 obj1.display();
		 

	}

}
