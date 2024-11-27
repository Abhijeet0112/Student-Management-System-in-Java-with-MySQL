package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {
	Connection conn;

	public StudentDao(Connection conn) {
		this.conn = conn;
	}
	public boolean insertStudent(Student s) {
		boolean status = false;
		try {
			PreparedStatement ps = conn.prepareStatement("insert into student (sname,address,phno) values (?,?,?)");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getAddress());
			ps.setString(3, s.getPhno());
			int s1 =ps.executeUpdate();
			if(s1==1) {
				status=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean updateStudent (Student s) {
		boolean status =false;
		try {
			PreparedStatement ps = conn.prepareStatement("update student set sname=?, phno=?, address=? where rollno=?");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getPhno());
			ps.setString(3, s.getAddress());
			ps.setInt(4, s.getRollno());
			int s1 =ps.executeUpdate();
			if(s1==1) {
				status=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public boolean deleteStudent(int rollno) {
		boolean status=false;
		try {
			PreparedStatement ps = conn.prepareStatement("Delete from student where rollno=?");
			ps.setInt(1, rollno);
			
			int s1= ps.executeUpdate();
			if (s1==1) {
				status=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public Student getStudentByRollno(int rollno) {
		Student s=null;
		try {
			PreparedStatement ps=  conn.prepareStatement("Select * from Student where rollno = ?");
			ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
//			System.out.println(rs.next());
			if(rs.next()) {
				s= new Student();
				s.setRollno(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setPhno(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setAddDate(rs.getTimestamp(5));
				s.setLastDate(rs.getTimestamp(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	public List<Student> getAllStudent(){
		List <Student> students=new ArrayList<Student>();
		Student student=null;
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from Student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//if data will exists then this loop will execute and we will create new student object
				student = new Student();
				student.setRollno(rs.getInt(1));
				student.setSname(rs.getString(2));
				student.setPhno(rs.getString(3));
				student.setAddress(rs.getString(4));
				student.setAddDate(rs.getTimestamp(5));
				student.setLastDate(rs.getTimestamp(6));
				//Adding student object in my ArrayList
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return students;
	}
}
