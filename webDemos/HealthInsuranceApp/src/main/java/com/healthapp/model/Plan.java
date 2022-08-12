package com.healthapp.model;

public class Plan {
	private String planName;
	private String brand;
	private String coverage;
	private double sumInsured;
	private String category;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public double getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", brand=" + brand + ", coverage=" + coverage + ", sumInsured="
				+ sumInsured + ", category=" + category + "]";
	}
}
