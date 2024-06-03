package com.log.reg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Avgames")
public class AvailableGames {
	
	@Id
	@GeneratedValue
	private int agid;
	private String gametitle;
	private String discount;
	private String price;
	private String discountprice;
	private String imgUrl;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getAgid() {
		return agid;
	}
	public void setAgid(int agid) {
		this.agid = agid;
	}
	public String getGametitle() {
		return gametitle;
	}
	public void setGametitle(String gametitle) {
		this.gametitle = gametitle;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(String discountprice) {
		this.discountprice = discountprice;
	}
}
