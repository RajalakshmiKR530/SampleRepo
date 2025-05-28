package polymorphismdiscount;

public class OffSeason  extends Discount
{
	public void discount(double price)
	{
		double discountprice = price * 0.40;
		double totaldiscount = price - discountprice;
		System.out.println("OffSeason Discounted Price : " +  totaldiscount );
		
	}	
	
 
	
}
