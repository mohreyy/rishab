package com.cg.springmvccc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="MobileDataa")
public class Mobile {

	@Id
	@Column(name="mob_id")
	Integer mobileId;
	
	@Column(name="mob_name")
	String mobileName;
	
	@Column(name="mob_price")
	Double mobPrice;
	
	@Column(name="mob_cato")
	String mobCategory;
	
	@Column(name="mob_online")
	String online;

	

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Double getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}

	public String getMobCategory() {
		return mobCategory;
	}

	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}
	
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName
				+ ", mobPrice=" + mobPrice + ", mobCategory=" + mobCategory
				+ ", online=" + online + "]";
	}
	
}
