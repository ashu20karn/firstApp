package com.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="performainvoice")
@Data
public class PerformaInvoice {


	@Id
	@GeneratedValue(generator = "pId")
	@GenericGenerator(name="pId", strategy = "increment")

	private int pId;
	private String piNumber;
	@Temporal(TemporalType.DATE)
	private Date piDate;
	private Double piAmount;
	public PerformaInvoice() {
		super();
	}
	public PerformaInvoice(String piNumber, Date piDate, Double piAmount) {
		super();
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
	}

	public PerformaInvoice(int pId, String piNumber, Date piDate, Double piAmount) {
		super();
		this.pId = pId;
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
	}



	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPiNumber() {
		return piNumber;
	}
	public void setPiNumber(String piNumber) {
		this.piNumber = piNumber;
	}
	public Date getPiDate() {
		return piDate;
	}
	public void setPiDate(Date piDate) {
		this.piDate = piDate;
	}
	public Double getPiAmount() {
		return piAmount;
	}
	public void setPiAmount(Double piAmount) {
		this.piAmount = piAmount;
	}
	@Override
	public String toString() {
		return "PerformaInvoice [pId=" + pId + ", piNumber=" + piNumber + ", piDate=" + piDate + ", piAmount=" + piAmount
				+ "]";
	}







}
