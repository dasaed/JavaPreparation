package oop_part;

public class Professor extends Student {
	private String subject;
	private int numCourses;
	private int hourPay;
	
	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public int getHourPay() {
		return hourPay;
	}

	public void setHourPay(int hourPay) {
		this.hourPay = hourPay;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Double salary() {
		Double totalSalary = (double) (this.numCourses * this.hourPay);
		return totalSalary;
	}
	Professor () {
		subject = "Unassigned";
		numCourses = 0;
		hourPay = 15;
	}
	
	Professor (int numCourses, int hourPay, String subject) {
		this.subject = subject;
		this.numCourses = numCourses;
		this.hourPay = hourPay;
	}
	
}
