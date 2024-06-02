package com.ey.taskstu;

import java.util.Date;


public class StudentTester
{
	public static void main(String[]args) {
		Student[] student=new Student[5];
		Student.setAdmissionCounter(10);
		student[0]=new Student("Ava"   ,new Date(101,3,20) ,new Integer[] {54,85,92});
		student[0].setGrade(null);
		student[1]=new Student("Liam"  ,new Date(102,1,15),new Integer[] {67,91,75});
		student[1].setGrade(null);
		student[2]=new Student("Olivia",new Date(105,6,28),new Integer[] {88,76,99});
		student[2].setGrade(null);
		student[3]=new Student("Ethan" ,new Date(104,5,11),new Integer[] {95,82,71});
		student[3].setGrade(null);
		student[4]=new Student("Rhea"  ,new Date(100,4,6) ,new Integer[] {73,90,67});
		student[4].setGrade(null);
		
		StudentService sc=new StudentService();
		sc.displayallStudents(student);
	}
	
	
}
		
	 

