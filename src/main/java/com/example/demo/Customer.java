package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customertable")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column
	String fullName;
	@Column
	String addressLine1;
	@Column
	String addressLine2;
	@Column
	String addressLine3;
	@Column
	String phoneNumber;
	@Column
	String country;
	@Column
	String city;
	
	//Getters & Setters
	  	public Integer getId() {
		    return id;
		}
		public void setId(Integer id) {
		    this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
			public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getAddressLine3() {
			return addressLine3;
		}
		public void setAddressLine3(String addressLine3) {
			this.addressLine3 = addressLine3;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString(){
			return fullName + " " + addressLine1 + " " + addressLine2 + " " + addressLine3 + " " + city + " " + country + " " + phoneNumber;
			
		}
		
}
