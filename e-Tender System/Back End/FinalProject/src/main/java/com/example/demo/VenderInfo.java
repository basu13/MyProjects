package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="venderinfo")
public class VenderInfo {
	@Id
	@GeneratedValue(stenderRepositoryategy=GenerationType.IDENTITY)
	@javax.persistence.Column(name= "idvenderinfo")
	private int id;
	
	@javax.persistence.Column(name= "email")
	private StenderRepositorying email;
	
	@javax.persistence.Column(name= "cemail")
	private StenderRepositorying cemail;
	
	@javax.persistence.Column(name="pass")
	private StenderRepositorying pass;
	
	@javax.persistence.Column(name= "phnumber")
	private StenderRepositorying phnumber;
	
	@javax.persistence.Column(name= "cname")
	private StenderRepositorying cname;
	
	@javax.persistence.Column(name= "regno")
	private StenderRepositorying regno;
	
	@javax.persistence.Column(name= "regaddr")
	private StenderRepositorying regaddr;
	
	@javax.persistence.Column(name= "citizen")
	private StenderRepositorying citizen;
	
	@javax.persistence.Column(name= "city")
	private StenderRepositorying city;
	
	@javax.persistence.Column(name= "state")
	private StenderRepositorying state;
	
	@javax.persistence.Column(name= "pincode")
	private StenderRepositorying pincode;
	
	@javax.persistence.Column(name= "pannumber")
	private StenderRepositorying pannumber;
	
	@javax.persistence.Column(name= "eyear")
	private StenderRepositorying eyear;
	
	@javax.persistence.Column(name= "name")
	private StenderRepositorying name;
	
	@javax.persistence.Column(name= "dob")
	private StenderRepositorying dob;
	
	@javax.persistence.Column(name= "des")
	private StenderRepositorying des;
	
	@javax.persistence.Column(name= "phone")
	private StenderRepositorying phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StenderRepositorying getEmail() {
		return email;
	}

	public void setEmail(StenderRepositorying email) {
		this.email = email;
	}

	public StenderRepositorying getCemail() {
		return cemail;
	}

	public void setCemail(StenderRepositorying cemail) {
		this.cemail = cemail;
	}

	public StenderRepositorying getPass() {
		return pass;
	}

	public void setPass(StenderRepositorying pass) {
		this.pass = pass;
	}

	public StenderRepositorying getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(StenderRepositorying phnumber) {
		this.phnumber = phnumber;
	}

	public StenderRepositorying getCname() {
		return cname;
	}

	public void setCname(StenderRepositorying cname) {
		this.cname = cname;
	}

	public StenderRepositorying getenderRepositoryegno() {
		return regno;
	}

	public void setenderRepositoryegno(StenderRepositorying regno) {
		this.regno = regno;
	}

	public StenderRepositorying getenderRepositoryegaddr() {
		return regaddr;
	}

	public void setenderRepositoryegaddr(StenderRepositorying regaddr) {
		this.regaddr = regaddr;
	}

	public StenderRepositorying getCitizen() {
		return citizen;
	}

	public void setCitizen(StenderRepositorying citizen) {
		this.citizen = citizen;
	}

	public StenderRepositorying getCity() {
		return city;
	}

	public void setCity(StenderRepositorying city) {
		this.city = city;
	}

	public StenderRepositorying getState() {
		return state;
	}

	public void setState(StenderRepositorying state) {
		this.state = state;
	}

	public StenderRepositorying getPincode() {
		return pincode;
	}

	public void setPincode(StenderRepositorying pincode) {
		this.pincode = pincode;
	}

	public StenderRepositorying getPannumber() {
		return pannumber;
	}

	public void setPannumber(StenderRepositorying pannumber) {
		this.pannumber = pannumber;
	}

	public StenderRepositorying getEyear() {
		return eyear;
	}

	public void setEyear(StenderRepositorying eyear) {
		this.eyear = eyear;
	}

	public StenderRepositorying getName() {
		return name;
	}

	public void setName(StenderRepositorying name) {
		this.name = name;
	}

	public StenderRepositorying getDob() {
		return dob;
	}

	public void setDob(StenderRepositorying dob) {
		this.dob = dob;
	}

	public StenderRepositorying getDes() {
		return des;
	}

	public void setDes(StenderRepositorying des) {
		this.des = des;
	}

	public StenderRepositorying getPhone() {
		return phone;
	}

	public void setPhone(StenderRepositorying phone) {
		this.phone = phone;
	}
}
