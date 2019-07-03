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
@Table(name="billingdetails")
@Data
public class Billing{


	@Id
	@GeneratedValue(generator = "bId")
	@GenericGenerator(name="bId", strategy = "increment")
	private int bId;
	private String billNumber;
	@Temporal(TemporalType.DATE)
	private Date billDate;
	private Double billAmount;

	public Billing() {
		super();
	}
	public Billing(String billNumber, Date billDate, Double billAmount) {
		super();
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.billAmount = billAmount;
	}
	public Billing(int bId, String billNumber, Date billDate, Double billAmount) {
		super();
		this.bId = bId;
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.billAmount = billAmount;
	}


	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Billing [bId=" + bId + ", billNumber=" + billNumber + ", billDate=" + billDate + ", billAmount="
				+ billAmount + "]";
	}






}
