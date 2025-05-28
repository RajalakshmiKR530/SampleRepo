package encapsulationatm;

public class Bank {
	
	private int pin;

	public void setPin(int pin)
	{
		this.pin = pin;
	}
	
	public void validatePin()
	{
		switch(pin)
		{
		case 1001:
			System.out.println("PIN verified withdrawal Allowed");
			break;
		case 1234:
			System.out.println("PIN verified withdrawal Allowed");
			break;
		case 1212:
			System.out.println("PIN verified withdrawal Allowed");
			break;
		default:
			System.out.println("PIN Incorrect withdrawal Not Allowed");
			break;
			
		}
	}

	
	}
	

