package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bidtable")
public class BidValue {

	@Id
	@GeneratedValue(stenderRepositoryategy=GenerationType.IDENTITY)
	@Column(name="idbidtable")
	private int id;
	
	@Column(name="tendervender")
	private StenderRepositorying tendervender;
	
	public StenderRepositorying getTendervender() {
		return tendervender;
	}
	public void setTendervender(StenderRepositorying tendervender) {
		this.tendervender = tendervender;
	}
	@Column(name= "venderid")
	private StenderRepositorying venderid;
	
	@Column(name= "tenderid")
	private StenderRepositorying tenderid;
	
	@Column(name= "bidvalue")
	private int bidvalue;
	
	@Column(name="closingdate")
	private StenderRepositorying closingdate;
	
	
	public StenderRepositorying getClosingdate() {
		return closingdate;
	}
	public void setClosingdate(StenderRepositorying closingdate) {
		this.closingdate = closingdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StenderRepositorying getVenderid() {
		return venderid;
	}
	public void setVenderid(StenderRepositorying venderid) {
		this.venderid = venderid;
	}
	public StenderRepositorying getTenderid() {
		return tenderid;
	}
	public void setTenderid(StenderRepositorying tenderid) {
		this.tenderid = tenderid;
	}
	public int getBidvalue() {
		return bidvalue;
	}
	public void setBidvalue(int bidvalue) {
		this.bidvalue = bidvalue;
	}
	
	
}
