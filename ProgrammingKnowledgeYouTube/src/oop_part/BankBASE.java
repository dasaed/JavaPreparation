package oop_part;

abstract public class BankBASE {
	
	abstract int getInterestRate(); // This is an abstract method
	/*
	 * Abstract methods can only exist in abstract classes
	 * They force the user to implement such methods whenever a class 
	 * inherits from an abstract class
	 */
	
	int creditLimit(double yearIncome,  String profession) {
		switch (profession) {
		case "Student":
			if (yearIncome > 1000) {
				return 1000;
			} else {
				return 500;
			}
		case "BlueCollar":
			if (yearIncome > 50000) {
				return 5000;
			} else {
				return 1000;
			}
		case "WhiteCollar":
			if (yearIncome > 50000) {
				return 5000;
			} else {
				return 1000;
			}
		case "Unemployed":
			return 0;
		default:
			return 0;
			
		}
	}
	
}
