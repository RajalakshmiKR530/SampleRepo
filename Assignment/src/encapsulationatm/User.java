package encapsulationatm;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your PIN");
		int pin =in.nextInt();
		
		
		Bank obj = new Bank();
		 obj.setPin(pin);
		 obj.validatePin();
	}

}
