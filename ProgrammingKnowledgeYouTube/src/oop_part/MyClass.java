package oop_part;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student carlos = new Student();
		carlos.setAge(28);
		carlos.setName("Carlos");
		carlos.setId(0);
		
		Student erika = new Student();
		erika.setAge(27);
		erika.setId(1);
		erika.setName("Erika");
		
		Professor dad = new Professor();
		Professor mom = new Professor (3, 25, "English");
		System.out.println(mom.getHourPay());
		System.out.println(dad.getHourPay());
		System.out.println(carlos.getAge());
	}

}
