package com.csm.Assessment.Model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "batchmaster")
public class Batch {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batchid;
	@Column
	private String batchdesc;
	@Column
	private String starttime;
	@Column
	private String endtime;
	@Column
	private Date startdate;
	@Column
	private Date enddate;
	
	
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getBatchdesc() {
		return batchdesc;
	}
	public void setBatchdesc(String batchdesc) {
		this.batchdesc = batchdesc;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	@Override
	public String toString() {
		return "Batch [batchid=" + batchid + ", batchdesc=" + batchdesc + ", starttime=" + starttime + ", endtime="
				+ endtime + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	
	
}
