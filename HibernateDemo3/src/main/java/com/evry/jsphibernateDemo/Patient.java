package com.evry.jsphibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	
	@Id
	private int id;
	private String name;
	private String age;
	private String blood_group;
	private String checkup;
	private String doctorName;
	private String test_recommended;

	public Patient() {
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getCheckup() {
		return checkup;
	}

	public void setCheckup(String checkup) {
		this.checkup = checkup;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTest_recommended() {
		return test_recommended;
	}

	public void setTest_recommended(String test_recommended) {
		this.test_recommended = test_recommended;
	}

}
