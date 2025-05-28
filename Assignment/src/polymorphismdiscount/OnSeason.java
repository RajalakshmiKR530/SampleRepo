package polymorphismdiscount;

public class OnSeason extends Discount 

{
	public void discount(double price)
	{
		double discountprice = price * 0.15;
		double totaldiscount = price - discountprice;
		System.out.println("OnSeason Discounted Price : " +  totaldiscount );
		
	}

}
