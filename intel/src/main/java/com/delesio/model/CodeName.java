package com.delesio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CodeName implements Serializable{

	@Id
	@JsonProperty("CodeNameId")
	private int CodeNameId;
	
	@JsonProperty("CodeNameType")
	private String CodeNameType;
	
	@JsonProperty("CodeNameText")
	private String CodeNameText;

	
	public int getCodeNameId() {
		return CodeNameId;
	}
	public void setCodeNameId(int codeNameId) {
		CodeNameId = codeNameId;
	}
	public String getCodeNameType() {
		return CodeNameType;
	}
	public void setCodeNameType(String codeNameType) {
		CodeNameType = codeNameType;
	}
	public String getCodeNameText() {
		return CodeNameText;
	}
	public void setCodeNameText(String codeNameText) {
		CodeNameText = codeNameText;
	}
	@Override
	public String toString() {
		return "CodeName [CodeNameId=" + CodeNameId + ", CodeNameType=" + CodeNameType + ", CodeNameText="
				+ CodeNameText + "]";
	}
	
	

}