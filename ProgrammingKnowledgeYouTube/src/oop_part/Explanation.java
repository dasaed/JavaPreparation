package oop_part;

public class Explanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyClass, Professor and Student are examples of polymorphism and the basics of classes \n");
		System.out.println("polymorphism = Multiple subclasses can be generated from a single class");
		System.out.println("\nThe bank classes are examples of abstract classes and methods");
		System.out.println("Abstract Classes can be extended into other classes, but cannot be instantiated");
		System.out.println("Banks DEF, ABC, and XYZ all have BASE as its parent class and can be instantiated");
		System.out.println("Bank BASE however cannot be instantiated\n   (BankBASE example = new BankBASE// This generates an error)");
		System.out.println("Abstract Methods can only exist within abstract Classes."
				+ "\nif an abstract class has an abstract method, then that method HAS TO "
				+ "\nbe implemented in any class that inherits from it");
		System.out.println("class extends class\n"
				+ "interface extends interface\n"
				+ "class implements interface ");
		
		BankInterfaceExample1 myBankA = new BankInterfaceExample1();
		BankInterfaceExample2 myBankB = new BankInterfaceExample2();
		
		myBankA.getAccountBalance();
		myBankB.getAccountBalance2();

	}	//end of public static void main(String[] args) {

	

}//end of explanation
