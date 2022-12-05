package com.example.demo;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Placement {
 
	@Id
	private Integer id;
	private String name;
	private String college;
	private LocalDate date;
	private String qualification;
	private int year;
	
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Placement(int id, String name, String college, LocalDate date, String qualification, int year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	
	

	
	
	
}
