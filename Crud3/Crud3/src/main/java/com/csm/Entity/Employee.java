package com.csm.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column
	private String empuname;
	@Column
	private String emppass;
	@Column
	private String empfname;
	@Column
	private String emplname;
	@Column
	private String empemail;
	@Column
	private String empdept;
	@Column
	private Date empdob;
	
	
	//Getter Setter
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpuname() {
		return empuname;
	}
	public void setEmpuname(String empuname) {
		this.empuname = empuname;
	}
	public String getEmppass() {
		return emppass;
	}
	public void setEmppass(String emppass) {
		this.emppass = emppass;
	}
	public String getEmpfname() {
		return empfname;
	}
	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public Date getEmpdob() {
		return empdob;
	}
	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}
	
	//ToString Method
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empuname=" + empuname + ", emppass=" + emppass + ", empfname=" + empfname
				+ ", emplname=" + emplname + ", empemail=" + empemail + ", empdept=" + empdept + ", empdob=" + empdob
				+ "]";
	}
	
	

}
