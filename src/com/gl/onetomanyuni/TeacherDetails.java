package com.gl.onetomanyuni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")

public class TeacherDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_details_id")
	private int id;
	@Column(name = "taught_course")
	private String course;
	@Column(name = "city")
	private String city;
	@Column(name = "blood_group")
	private String bloodGrp;

	public TeacherDetails() {

	}

	public TeacherDetails(String course, String city, String bloodGrp) {
		this.course = course;
		this.city = city;
		this.bloodGrp = bloodGrp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", course=" + course + ", city=" + city + ", bloodGrp=" + bloodGrp + "]";
	}

}
