package polymorphismdiscount;

public class DiscountMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount ref;
		
	    
		ref = new OnSeason();
		ref.discount(2000.0);
		
		ref = new OffSeason();
		ref.discount(4000.5);
		
	}

}
