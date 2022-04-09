package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Srikaviya");
	}
	
	public void studentDept()
	{
		System.out.println("Information Technology");
	}
	
	public void studentId() {
		System.out.println("8041784");
	}
	
	public static void main(String[] args) {
		Student details = new Student();
		details.studentName();
		details.studentDept();
		details.studentId();
		details.deptName();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		
	}
}