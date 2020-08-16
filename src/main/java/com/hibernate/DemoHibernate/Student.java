package com.hibernate.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid;
	private StudentName StudentName;
	private String smarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public StudentName getStudentName() {
		return StudentName;
	}
	public void setStudentName(StudentName studentName) {
		StudentName = studentName;
	}
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	
	
	
	

}
