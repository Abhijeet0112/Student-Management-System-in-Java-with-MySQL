package com.main;

import java.util.Scanner;

import com.conn.DBConnect;
import com.dao.StudentDao;
import com.entity.Student;

public class InsertMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease Enter your Name");
		String name =sc.nextLine();
		System.out.println("PLease Enter your Phone number");
		String phno= sc.nextLine();
		System.out.println("PLease Enter your Address");
		String address =sc.nextLine();
		
		student.setSname(name);
		student.setPhno(phno);
		student.setAddress(address);
		
		StudentDao studentDao = new StudentDao(DBConnect.getConnection());
		boolean ins1 = studentDao.insertStudent(student);
		
		if(ins1) {
			System.out.println("Data Inserted Successfully...");
		}else {
			System.out.println("Something bad happen on server...");
		}
	}

}
