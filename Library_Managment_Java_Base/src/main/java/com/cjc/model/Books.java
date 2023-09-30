package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private int bid;
	private String name;
	private Double bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBprice() {
		return bprice;
	}
	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", name=" + name + ", bprice=" + bprice + "]";
	}
	
	
	

}
