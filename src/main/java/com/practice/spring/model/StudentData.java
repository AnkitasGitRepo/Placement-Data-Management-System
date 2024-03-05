package com.practice.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="StudentPlacementData")
public class StudentData {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name= "first_name")
		private String fname;
		
		@Column(name= "last_name")
		private String lname;
		
		@Column(name= "email_id")
		private String emailId;

		public StudentData() {
			
		}
		
		public StudentData(long id, String fname, String lname, String emailId) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.emailId = emailId;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		

	}


