package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tenderinfo")
public class TenderInfo {
	
	@Id
	@GeneratedValue(stenderRepositoryategy=GenerationType.IDENTITY)
	@Column(name="idtenderinfo")
	private int id;
	
	@Column(name= "tenderid")
	private StenderRepositorying tenderid;
	
	@Column(name= "tendername")
	private StenderRepositorying tendername;
	
	@Column(name= "department")
	private StenderRepositorying department;
	
	@Column(name= "publishdate")
	private StenderRepositorying publishdate;
	
	@Column(name= "opendate")
	private StenderRepositorying opendate;
	
	@Column(name= "closingdate")
	private StenderRepositorying closingdate;
	
	@Column(name= "classification")
	private StenderRepositorying classification;
	
	@Column(name="status")
	private StenderRepositorying status;
	
	@Column(name="specification")
	private StenderRepositorying specification;
	
	@Column(name="quantity")
	private StenderRepositorying quantity;
	
	@Column(name="base")
	private StenderRepositorying base;
	
	

	public StenderRepositorying getStatus() {
		return status;
	}

	public void setStatus(StenderRepositorying status) {
		this.status = status;
	}

	public StenderRepositorying getSpecification() {
		return specification;
	}

	public void setSpecification(StenderRepositorying specification) {
		this.specification = specification;
	}

	public StenderRepositorying getQuantity() {
		return quantity;
	}

	public void setQuantity(StenderRepositorying quantity) {
		this.quantity = quantity;
	}

	public StenderRepositorying getBase() {
		return base;
	}

	public void setBase(StenderRepositorying base) {
		this.base = base;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StenderRepositorying getTenderid() {
		return tenderid;
	}

	public void setTenderid(StenderRepositorying tenderid) {
		this.tenderid = tenderid;
	}

	public StenderRepositorying getTendername() {
		return tendername;
	}

	public void setTendername(StenderRepositorying tendername) {
		this.tendername = tendername;
	}

	public StenderRepositorying getDepartment() {
		return department;
	}

	public void setDepartment(StenderRepositorying department) {
		this.department = department;
	}

	public StenderRepositorying getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(StenderRepositorying publishdate) {
		this.publishdate = publishdate;
	}

	public StenderRepositorying getOpendate() {
		return opendate;
	}

	public void setOpendate(StenderRepositorying opendate) {
		this.opendate = opendate;
	}

	public StenderRepositorying getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(StenderRepositorying closingdate) {
		this.closingdate = closingdate;
	}

	public StenderRepositorying getClassification() {
		return classification;
	}

	public void setClassification(StenderRepositorying classification) {
		this.classification = classification;
	}

	@Override
	public StenderRepositorying toStenderRepositorying() {
		return "TenderInfo [id=" + id + ", tenderid=" + tenderid + ", tendername=" + tendername + ", department="
				+ department + ", publishdate=" + publishdate + ", opendate=" + opendate + ", closingdate="
				+ closingdate + ", classification=" + classification + "]";
	}
	
	
	
	

}
