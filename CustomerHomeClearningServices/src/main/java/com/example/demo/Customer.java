package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Customer {
@GeneratedValue
@Id
int id;
String name;
String email;
String city;
int phoneNumber;
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

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getCity() {
	return city;
}
public void setcity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Customer [id=" + id + ",  name=" + name+", city="+city+", phoneNumber= "+phoneNumber+",email= "+ email
			+"]";
}

}
