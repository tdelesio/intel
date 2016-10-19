package com.delesio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class ProductSeries implements Serializable {

	@Id
	@JsonProperty("SeriesId")
	private Integer SeriesId;
	
	@JsonProperty("SeriesName")
	private String SeriesName;
	
	public Integer getSeriesId() {
		return SeriesId;
	}
	public void setSeriesId(Integer seriesId) {
		SeriesId = seriesId;
	}
	public String getSeriesName() {
		return SeriesName;
	}
	public void setSeriesName(String seriesName) {
		SeriesName = seriesName;
	}

	
}