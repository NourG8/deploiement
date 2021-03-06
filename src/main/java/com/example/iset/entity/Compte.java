package com.example.iset.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compte {
@Id
@GeneratedValue
	private long code;
	private double solde;
	private Date dateC;
	
	public Compte(long code, double solde, Date dateC) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateC = dateC;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateC() {
		return dateC;
	}

	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}
	
	
}
