package com.examples.customerservice.model;

import javax.persistence.Id;

public class OrderDto {

	int cid;
	
	int oid;
	
	String pname;
	
	int price;
	
	public OrderDto() {
		
	}

	public OrderDto(int cid, int oid, String pname, int price) {
		super();
		this.cid = cid;
		this.oid = oid;
		this.pname = pname;
		this.price = price;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
