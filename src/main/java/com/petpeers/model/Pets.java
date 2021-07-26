package com.petpeers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pets")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	@Column(name = "pet_name")
	private String petName;
	@Column(name = "pet_age")
	private String petAge;
	@Column(name = "pet_place")
	private String petPlace;
	@Column(name = "pet_buy_or_sold")
	private String petBuyOrSold;
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetAge() {
		return petAge;
	}
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	public String getPetBuyOrSold() {
		return petBuyOrSold;
	}
	public void setPetBuyOrSold(String petBuyOrSold) {
		this.petBuyOrSold = petBuyOrSold;
	}	

}
