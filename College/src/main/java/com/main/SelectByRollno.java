package com.main;

import java.util.Scanner;

import com.conn.DBConnect;
import com.dao.StudentDao;
import com.entity.Student;

public class SelectByRollno {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter Roll Number : ");
		int rollno = sc.nextInt();
		
		StudentDao sDao = new StudentDao(DBConnect.getConnection());
		
		Student st= sDao.getStudentByRollno(rollno);
		
		if(st==null) {
			System.out.println("Student Does Not Exists");
		}else {
			System.out.println("-------------------------------");
			System.out.println("~~~ Student Information ~~~");
			System.out.println("-------------------------------");
			System.out.println("Roll Number : "+st.getRollno());
			System.out.println("Name : "+st.getSname());
			System.out.println("Phone Number : "+st.getPhno());
			System.out.println("Address : "+st.getAddress());
			System.out.println("Admission Date and Time : "+st.getAddDate());
			System.out.println("Last Update Date and Time : "+st.getLastDate());
			System.out.println("-------------------------------");
		}

	}

}
