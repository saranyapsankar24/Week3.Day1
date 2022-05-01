package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Student name : Saranya");
	
}
public void studentDept() {
	System.out.println("Department : Computer Science");
}
public void studentID() {
	System.out.println("Student ID : 10");
}

public static void main(String[] args) {
	Student student=new Student();
	student.collegeName();
	student.collegeCode();
	student.collegeRank();
	student.deptName();
	student.studentName();
	student.studentDept();
	student.studentID();
}
}
