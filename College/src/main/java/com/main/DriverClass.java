package com.main;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.conn.DBConnect;
import com.dao.StudentDao;
import com.entity.Student;

public class DriverClass {

	public static void main(String[] args) {
//		Connection conn = DBConnect.getConnection();
//		System.out.println(conn);
		boolean status= true;
		int rollno,choice;
		String name,phno,address;
		Scanner sc = new Scanner(System.in);
		StudentDao sDao = new StudentDao(DBConnect.getConnection());
		while(status) {
			System.out.println("\n\n--------------------------------------------");
			System.out.println("Please press from following option : ");
			System.out.println("--------------------------------------------");
			System.out.println("1. Insert New Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Get Student by Roll Number");
			System.out.println("5. Get All Students");
			System.out.println("6. Exit");
			choice= sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please Enter your name");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Please Enter Your Phone Number");
				phno=sc.nextLine();
				System.out.println("Please Enter Your address");
				address=sc.nextLine();
				Student s1 = new Student();
				s1.setSname(name);
				s1.setPhno(phno);
				s1.setAddress(address);
				
				boolean c1 = sDao.insertStudent(s1);
				if(c1) {
					System.out.println("Data Inserted Successfully...");
				}else {
					System.out.println("Something wrong happen on server...");
				}
				
				break;
			case 2:
				System.out.println("Please Enter your Roll Number");
				rollno=sc.nextInt();
				System.out.println("Please Enter your New name");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Please Enter Your New Phone Number");
				phno=sc.nextLine();
				System.out.println("Please Enter Your New address");
				address=sc.nextLine();
				Student s2 = new Student();
				s2.setRollno(rollno);
				s2.setSname(name);
				s2.setPhno(phno);
				s2.setAddress(address);
				boolean c2 = sDao.updateStudent(s2);
				if(c2) {
					System.out.println("Data Updated Successfully...");
				}else {
					System.out.println("Student Does not Exists...Please Check your roll number");
				}
				break;
			case 3:
				System.out.println("Please Enter your Roll Number");
				rollno=sc.nextInt();
				boolean c3 = sDao.deleteStudent(rollno);
				if(c3) {
					System.out.println("Student Deleted Successfully...");
				}else {
					System.out.println("Student Does not Exists...Please Check your roll number");
				}
				break;
			case 4:
				System.out.println("Please Enter your Roll Number");
				rollno=sc.nextInt();
				Student st= sDao.getStudentByRollno(rollno);
				if(st==null) {
					System.out.println("Student Does Not Exists");
				}else {
					System.out.println("-----------------------------------------");
					System.out.println("~~~ Student Information ~~~");
					System.out.println("-----------------------------------------");
					System.out.println("Roll Number : "+st.getRollno());
					System.out.println("Name : "+st.getSname());
					System.out.println("Phone Number : "+st.getPhno());
					System.out.println("Address : "+st.getAddress());
					System.out.println("Admission Date and Time : "+st.getAddDate());
					System.out.println("Last Update Date and Time : "+st.getLastDate());
					System.out.println("-----------------------------------------");
				}
				
				break;
			case 5:
				List<Student>students = sDao.getAllStudent();
				if (students.isEmpty()) {
					System.out.println("No Student is Available");
				}else {
					for (Student st1:students) {
						System.out.println("-------------------------------");
						System.out.println("~~~ Student Information ~~~");
						System.out.println("-------------------------------");
						System.out.println("Roll Number : "+st1.getRollno());
						System.out.println("Name : "+st1.getSname());
						System.out.println("Phone Number : "+st1.getPhno());
						System.out.println("Address : "+st1.getAddress());
						System.out.println("Admission Date and Time : "+st1.getAddDate());
						System.out.println("Last Update Date and Time : "+st1.getLastDate());
						System.out.println("-------------------------------");
					}
				}
				
				break;
			case 6:
				System.out.println("Thanks Visit Again...");
				status=false;
				break;

			default:
			}
		}
	}

}
