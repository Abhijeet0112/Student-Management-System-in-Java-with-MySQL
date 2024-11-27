package com.main;

import java.util.Scanner;

import com.conn.DBConnect;
import com.dao.StudentDao;

public class DeleteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter Roll Number : ");
		int rollno = sc.nextInt();
		
		StudentDao sDao = new StudentDao(DBConnect.getConnection());
		boolean del1 = sDao.deleteStudent(rollno);
		if(del1) {
			System.out.println("Student Removed Successfully...");
		}else {
			System.out.println("Sttudent Does Not Exists...");
		}
	}

}
