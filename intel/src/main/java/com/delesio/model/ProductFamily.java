package com.delesio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class ProductFamily implements Serializable {

	@Id
	@JsonProperty("FamilyId")
	private Integer FamilyId;
	
	@JsonProperty("FamilyName")
	private String FamilyName;
	
	public Integer getFamilyId() {
		return FamilyId;
	}
	public void setFamilyId(Integer familyId) {
		FamilyId = familyId;
	}
	public String getFamilyName() {
		return FamilyName;
	}
	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}

}