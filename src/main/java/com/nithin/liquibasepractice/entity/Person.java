package com.nithin.liquibasepractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

	@Entity
	@Table(name = "person")
	@Data
	public class Person {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	
		@Column(name = "name", length = 20)
		private String name;
	
		@Column(name = "phonenumber", length = 12)
		private String phoneNumber;
		
	    @Column(name = "city", length = 20)
	    private String city;
	
	}
