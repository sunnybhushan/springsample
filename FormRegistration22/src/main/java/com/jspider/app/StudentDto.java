package com.jspider.app;


public class StudentDto 
{
	String firstName;
	String lstName;
	String mobNo;
	String stream;
	String date;
	String isMaried;
	String rollNo;
	String subject;
	String address;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLstName() {
		return lstName;
	}

	public void setLstName(String lstName) {
		this.lstName = lstName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIsMaried() {
		return isMaried;
	}

	public void setIsMaried(String isMaried) {
		this.isMaried = isMaried;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDto [firstName=" + firstName + ", lstName=" + lstName + ", mobNo=" + mobNo + ", stream=" + stream
				+ ", date=" + date + ", isMaried=" + isMaried + ", rollNo=" + rollNo + ", subject=" + subject
				+ ", address=" + address + "]";
	}
	
	

}
