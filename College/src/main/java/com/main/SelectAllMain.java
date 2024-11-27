package com.main;

import java.util.List;

import com.conn.DBConnect;
import com.dao.StudentDao;
import com.entity.Student;

public class SelectAllMain {

	public static void main(String[] args) {
		StudentDao sDao = new StudentDao(DBConnect.getConnection());
		List<Student>students = sDao.getAllStudent();
		if (students.isEmpty()) {
			System.out.println("No Student is Available");
		}else {
			for (Student st:students) {
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

}
