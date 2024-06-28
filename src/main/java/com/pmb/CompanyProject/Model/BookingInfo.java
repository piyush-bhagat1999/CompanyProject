package com.pmb.CompanyProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookingInfo {

	private String patientName;
	private String doctorName;
	
	@Id
	private String phone;
	private String symptoms;
	private String date;
	
	public BookingInfo() {
		// TODO Auto-generated constructor stub
	}

	public BookingInfo(String patientName, String doctorName, String departmentName, String phone, String symptoms,
			String date) {
		super();
		this.patientName = patientName;
		this.doctorName = doctorName;
		
		this.phone = phone;
		this.symptoms = symptoms;
		this.date = date;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookingInfo [patientName=" + patientName + ", doctorName=" + doctorName + ", phone=" + phone
				+ ", symptoms=" + symptoms + ", date=" + date + "]";
	}

	
	
	
}
