package com.jsp.hibernate.demo.Demo_Bike;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	private int busId;
	private String busBrand;
	private String busModel;
	private int busPrice;
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusBrand() {
		return busBrand;
	}
	public void setBusBrand(String busBrand) {
		this.busBrand = busBrand;
	}
	public String getBusModel() {
		return busModel;
	}
	public void setBusModel(String busModel) {
		this.busModel = busModel;
	}
	public int getBusPrice() {
		return busPrice;
	}
	public void setBusPrice(int busPrice) {
		this.busPrice = busPrice;
	}
	

}
