package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="projstatus")
@Data
public class ProjectStatus {
	
	@Id
	@GeneratedValue(generator = "psId")
	@GenericGenerator(name="psId", strategy = "increment")
	private int psId;
	private String Status;
	public ProjectStatus() {
		super();
	}
	
	public ProjectStatus(String status) {
		super();
		Status = status;
	}

	public ProjectStatus(int psId, String status) {
		super();
		this.psId = psId;
		Status = status;
	}
	

	public int getPsId() {
		return psId;
	}

	public void setPsId(int psId) {
		this.psId = psId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "ProjectStatus [psId=" + psId + ", Status=" + Status + "]";
	}
	
	

}
