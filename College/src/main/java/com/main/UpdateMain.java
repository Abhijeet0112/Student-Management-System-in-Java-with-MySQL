package com.main;

import java.util.Scanner;

import com.conn.DBConnect;
import com.dao.StudentDao;
import com.entity.Student;

public class UpdateMain {

	public static void main(String[] args) {

		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease Enter Your Roll Number: ");
		int rollno = sc.nextInt();
		
		sc.nextLine(); //to store the spaces do this when u are doing console based applications and accepting string data right after integer data
		
		
		System.out.println("PLease Enter your New Name");
		String name =sc.nextLine();
		System.out.println("PLease Enter your New Phone number");
		String phno= sc.nextLine();
		System.out.println("PLease Enter your New Address");
		String address =sc.nextLine();
		
		student.setRollno(rollno);
		student.setSname(name);
		student.setPhno(phno);
		student.setAddress(address);
		
		StudentDao studentDao = new StudentDao(DBConnect.getConnection());
		boolean up1 =studentDao.updateStudent(student);
		
		if(up1) {
			System.out.println("Data Updated Successfully...");
		}else {
			System.out.println("Student Not Exists...");
		}
	}

}
