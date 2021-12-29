package com.csm.Assessment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	@Column
	private String studentname;
	@Column
	private String studentphn;
	@Column
	private String studentemail;
	
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentphn() {
		return studentphn;
	}
	public void setStudentphn(String studentphn) {
		this.studentphn = studentphn;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", studentname=" + studentname + ", studentphn=" + studentphn
				+ ", studentemail=" + studentemail + "]";
	}
	
	
	
	
	
}
