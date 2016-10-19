package com.delesio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class ProcessorBrand implements Serializable{

	@Id
	@JsonProperty("BrandId")
	private Integer BrandId;
	
	@JsonProperty("BrandName")
	private String BrandName;
	
	public Integer getBrandId() {
		return BrandId;
	}
	public void setBrandId(Integer brandId) {
		BrandId = brandId;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	
	
}